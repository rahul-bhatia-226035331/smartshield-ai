pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Quality') {
            steps {
                bat 'mvn checkstyle:check'
            }
        }

        stage('Security Scan') {
            steps {
                bat '"C:\\Users\\rahul\\AppData\\Local\\Microsoft\\WinGet\\Links\\trivy.exe" image smartshield-ai'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t smartshield-ai .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker stop smartshield-container || exit 0'
                bat 'docker rm smartshield-container || exit 0'
                bat 'docker run -d -p 8082:8081 --name smartshield-container smartshield-ai'
            }
        }

        stage('Release') {
            steps {
                bat 'git tag v1.0.%BUILD_NUMBER%'
            }
        }

        stage('Monitoring') {
            steps {
                bat 'curl http://localhost:8082/actuator/health || exit 0'
            }
        }
    }
}
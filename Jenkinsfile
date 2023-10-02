pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven', type: 'hudson.tasks.Maven$MavenInstallation'
                    def mavenCommand = isUnix() ? "${mvnHome}/bin/mvn" : "${mvnHome}\\bin\\mvn"

                    // Build and run tests for each profile
                    def profiles = ['unit-tests', 'smoke-tests', 'integration-tests', 'End-to-End-tests']

                    for (profile in profiles) {
                        sh "${mavenCommand} clean install -P${profile}"
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application here (if applicable)
                // Define deployment steps
            }
        }
    }

    post {
        success {
            echo 'Build succeeded! Congratulations!'
        }

        failure {
            echo 'Build failed! Sorry!'
        }
    }
}

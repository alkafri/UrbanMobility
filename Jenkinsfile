pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out your Git repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build your Java project here
                sh 'mvn clean install' // Example Maven build command
            }
        }

        stage('Test') {
            steps {
                // Run your tests here
                sh 'mvn test' // Example Maven test command
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application here (if applicable)
            }
        }
    }
}

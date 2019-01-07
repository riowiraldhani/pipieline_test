pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('move') {
            steps {
                sh 'cd test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('install') {
            steps {
                sh 'mvn install'
            }
        }
    }
}
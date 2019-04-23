pipeline {
    agent any
    tools {
        maven 'M3' 
    }
    stages {
        stage('build') {
            steps {
                sh 'sudo mvn install dockerfile:build'
            }
        }
    }
}
pipeline {
    agent any
    tools {
        maven 'M3' 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn install dockerfile:push'
            }
        }
    }
}
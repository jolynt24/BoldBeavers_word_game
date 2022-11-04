pipeline {
 agent any
 tools {
  maven 'm3'
 }
  stages {   
    stage('Checkout') {
        steps {
            git url: 'https://github.com/MTrain12/word_game_group.git',
                branch: 'main'
        }
    }
    stage('Test') {
      steps {
        sh "mvn clean test"
      }
    }
    stage('Build') {
      steps {
        sh "mvn -DskipTests=true clean package"
        sh "docker build -t word_game_app ."
      }
    }
    stage('Deploy') {
      steps {
        sh "echo 'Deploying'"
      }
    }
  }
}

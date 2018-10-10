pipeline {
  agent {
    node {
      label "jenkins-agent"
      customWorkspace "workspace/${URLDecoder.decode(JOB_NAME)}/${BUILD_NUMBER}"
    }
  }

  stages {
    stage('Compile Source') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Run Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('SonarQube analysis') {
      steps {
        script {
          scannerHome = tool 'SonarQube'
        }
        withSonarQubeEnv('SonarQube') {
          sh "mvn sonar:sonar"
        }
      }
    }
    stage('Install') {
        steps {
            sh 'mvn install'
        }
    }
  }
}

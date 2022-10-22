def call (){
  pipeline {
    agent { label 'NODEJ1-JDK11' }
    stages {
        stage('git') { 
            steps {
                git url: 'https://github.com/rajagithub18/spring-petclinic.git',
                branch: 'main'
            }
        }
    }
    }
}

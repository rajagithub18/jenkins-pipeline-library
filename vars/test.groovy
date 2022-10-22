def call (){
  pipeline {
    agent { label 'NODEJS-JDK11' }
    stages {
        stage('git') { 
            steps {
                 sh'echo raja'
            }
        }
    }
    }
}

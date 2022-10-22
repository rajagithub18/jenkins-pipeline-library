def call (){
  pipeline {
    agent { label 'NODEJ1-JDK11' }
    stages {
        stage('git') { 
            steps {
                 sh'echo raja'
            }
        }
    }
    }
}

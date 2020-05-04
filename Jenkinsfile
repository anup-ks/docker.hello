pipeline {
    agent any
    
    stages {
    
        stage('compile stage') {
        
        	steps {
	     		withMaven(maven : "M3") {
	     			
	     			sh 'mvn clean compile'
	     			                    
	     		}

        	}

        }

    }

}

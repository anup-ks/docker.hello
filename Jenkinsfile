pipeline {
    agent any
    
    stages {
    
        stage('compile stage') {
        
        	steps {
	     		withMaven(maven : "M3_3.6.3") {
	     			
	     			sh 'mvn clean compile'
	     			                    
	     		}

        	}

        }

    }

}
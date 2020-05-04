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
        
        stage('test stage') {
			withMaven(maven : "M3") {
				sh 'mvn test'
			}
        }
        
        stage('package stage') {
        	withMaven(maven : "M3") {
        		sh 'mvn package'
			}

        }


    }

}

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
			steps {
			    withMaven(maven : "M3") {
					sh 'mvn test'
				}
			}
        }
        
        stage('package stage') {
        	steps {
        	    withMaven(maven : "M3") {
	        		sh 'mvn package'
				}
        	}
        }

		stage('setup image') {
			steps {
			    sh 'docker build -t docker-spring-boot .'
			}	
		}
    }
}

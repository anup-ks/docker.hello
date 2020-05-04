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

		stage('setup docker image') {
			steps {
			    sh 'docker build -t anupks/docker-spring-boot:1.0 .'
			}	
		}
		
		stage('push docker image') {
			steps {
				withCredentials([string(credentialsId: 'id-dockerhub-pwd', variable: 'dockerhubPwd')]) {
				    sh "docker login -u anupks -p ${dockerhubPwd}"
				}
				sh 'docker push anupks/docker-spring-boot:1.0'
			}
		}
		stage('run docker container') {
			steps {
				sh 'docker run --rm -p 9090:9090 --name docker-spring-book-i -d anupks/docker-spring-boot:1.0'			    
			}	          
	    }
    }
}

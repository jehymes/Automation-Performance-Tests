pipeline {
	agent any
	tools {
        maven 'maven'
		jdk 'jdk11'
    }
	stages {
		stage('Check Variables Environment') {
			steps {
				bat "java --version"
				bat "mvn --version"
			}
		}

		stage('Compile Package') {
			steps {
				bat "mvn clean package -Dmaven.test.skip=true"
			}
		}
	}

	post {
        always {
            dir('target/jmeter/results/'){
                bat "ren *.csv SICREDI.csv"
            }
            dir('target/jmeter/results/HTMLReports'){
                deleteDir()
            }
            dir('target/jmeter/results/'){
                bat "mkdir HTMLReports"
            }
            dir('C:\\JMeter\\bin\\') {
				bat "jmeter -g C:/Windows/System32/config/systemprofile/AppData/Local/Jenkins/.jenkins/workspace/prova-sicredi-performance/target/jmeter/results/SICREDI.csv -o C:/Windows/System32/config/systemprofile/AppData/Local/Jenkins/.jenkins/workspace/prova-sicredi-performance/target/jmeter/results/HTMLReports" 
            }
            
            publishHTML (target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: "target/jmeter/results/HTMLReports/",
                reportFiles: 'index.html',
                reportName: 'JMeter Report'
            ]
			
			cleanWs()
		}
	}
}
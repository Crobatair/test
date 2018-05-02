node('docker-slave'){
	stage('get source code'){
	   checkout scm
	}
	stage('Run test'){
	   sh '$MAVEN test'
	}
	stage('build'){
	   sh '$MAVEN -B -DskipTests clean package'
	}
        stage('copy artifact'){
	   script {
                 step ([$class: 'CopyArtifact',
                 projectName: 'Test',
                 filter: "target/test*.jar",
                 target: 'Build']);
             }	   
	}    
}

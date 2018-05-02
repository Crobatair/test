node('docker-slave'){
	stage('get source code'){
	   checkout scm
	}
	stage('Run test'){
	   sh '$MAVEN tests'
	}
	stage('build'){
	   sh '$MAVEN -B -DskipTests clean package'
	}
        stage('copy artifact'){
	   script {
                 step ([$class: 'CopyArtifact',
                 projectName: 'Test',
                 filter: "packages/*.jar",
                 target: 'Build']);
             }	   
	}    
}

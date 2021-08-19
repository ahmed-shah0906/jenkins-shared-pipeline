pipeline {
    agent any
   
    stages {
        stage('Clean WorkSpace') {
            steps {
                cleanWs()
            }
        }
        
        stage('Print Artifact Path'){
            steps{
                    Map filePath = [repo: 'Path_To_Repo_Global/' , branchName: 'feature/pdf']
                    echo artifacts.getArtifactPath(filePath)  
            }
        }
   }
}
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
                script {
                    Map filePath = [repo: 'Path_To_Repo_Global/' , branchName: 'feature/pdf']
                    echo artifacts.getArtifactPath(filePath)
                }
            }
        }
   }
}
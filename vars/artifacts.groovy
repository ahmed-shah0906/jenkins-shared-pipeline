def getArtifactFileName(String branchName, String zipPackageType) {
    return branchName.replace("/","-")+"-$zipPackageType"+".zip"+"Artifacts"
}

def getArtifactPath(String repo, String branchName){
    return repo + branchName.replace("/","%2F")
}
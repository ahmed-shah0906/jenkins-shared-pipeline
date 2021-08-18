def getArtifactFileName(String branchName, String zipPackageType) {
    return branchName.replace("/","-")+"-$zipPackageType"+".zip"+"Artifacts"
}

def getArtifactPath(String repo, String branchName){
    assert repo : 'repo name is required'
    return repo + branchName.replace("/","%2F")
}
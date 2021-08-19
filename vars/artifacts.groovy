def getArtifactFileName(String branchName, String zipPackageType) {
    return branchName.replace("/","-")+"-$zipPackageType"+".zip"+"Artifacts"
}

def getArtifactPath(Map inputParam){
    assert inputParam.repo : 'repo name is required'
    assert inputParam.branchName : 'branch name is required'
    return inputParam.repo + inputParam.branchName.replace("/","%2F")
}
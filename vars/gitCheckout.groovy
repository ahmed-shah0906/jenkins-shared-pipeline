def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }


def List<PackageSource> getNugetSources(){
    List<PackageSource> nugetPackageSources =[ new PackageSource(key: "Nuget_Feed", sourceUrl: "https://api.nuget.org/v3/index.json"),
	                                           new PackageSource(
																	key: "Source_Prod",
																	sourceUrl: "https://abc.io/prod",
																	protocolVersion: 2,
																	credentialsId: "1"
																)
											 ]

	        												
	if(!BRANCH_NAME.equals('master')){
      nugetPackageSources.add(new PackageSource(
												  key: "Source_Dev",
												  sourceUrl: "https://abc.io/dev",
												  protocolVersion: 2,
												  credentialsId: "2"
											   )
					     )
	}	
	return nugetPackageSources
}
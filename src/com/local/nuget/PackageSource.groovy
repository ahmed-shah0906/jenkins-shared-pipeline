package com.local.nuget

/**
 * Encapsulates a nuget source for .NET packages
 */
class PackageSource {
   /**
    * The name that the nuget source should be given
    */
   String key

   /**
    * The URL of the nuget server for this source
    */
   String sourceUrl

   /**
    * The NuGet protocol version to use. This should be 2 for Artifactory until v3 is fixed
    */
   int protocolVersion

   /**
    * The ID of the credentials that grant access to this nuget server
    */
   String credentialsId
}

def pushtoNexus( String nexus_username,String nexus_password,String nexus_url,String nexus_repoId,String packageName,String currentVersion){

 def currentVersion = version.readVersion("package.json")
 sh "curl -v -u ${nexus_username}:${nexus_password} --upload-file dist.tar.gz ${nexus_url}/repository/${nexus_repoId}/${packageName}/${currentVersion}/${PACKAGE_NAME}-${currentVersion}.${env.BUILD_ID}.tar.gz"
 echo "Artifact deployed to Nexus with version ${currentVersion}"
}

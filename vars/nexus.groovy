def pushtoNexus( String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String NEXUS_REPO_ID,String PACKAGE_NAME){

 def currentVersion = version.readVersion("package.json")
 //sh "curl -v -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} --upload-file dist.tar.gz ${NEXUS_URL}/repository/${NEXUS_REPO_ID}/${PACKAGE_NAME}/${currentVersion}/${PACKAGE_NAME}-${currentVersion}.${env.BUILD_ID}.tar.gz"
   sh """
        curl -v -u \${NEXUS_USERNAME}:\${NEXUS_PASSWORD} --upload-file dist.tar.gz \${NEXUS_URL}/repository/\${NEXUS_REPO_ID}/\${PACKAGE_NAME}/\${currentVersion}/\${PACKAGE_NAME}-\${currentVersion}.\${env.BUILD_ID}.tar.gz
    """
 echo "Artifact deployed to Nexus with version ${currentVersion}"
}

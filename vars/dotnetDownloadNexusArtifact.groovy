def download(String OUTPUTFILENAME,String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String NEXUS_REPO_ID,String PACKAGE_NAME,String BUILD_ID){

  sh "curl -v -o ${OUTPUTFILENAME} -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} ${NEXUS_URL}/repository/${NEXUS_REPO_ID}/${PACKAGE_NAME}/${PACKAGE_NAME}-${BUILD_ID}.tar.gz"                    


}

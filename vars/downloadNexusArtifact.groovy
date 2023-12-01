def download(String OUTPUTFILENAME,String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String NEXUS_REPO_ID,String PACKAGE_NAME,String String VERSION){

  sh "curl -v -o ${OUTPUTFILENAME} -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} ${NEXUS_URL}/repository/${NEXUS_REPO_ID}/${PACKAGE_NAME}/1.0.1/${PACKAGE_NAME}-${VERSION}.tar.gz"                    }


}

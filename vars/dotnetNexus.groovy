def push(String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String NEXUS_REPO_ID,String PACKAGE_NAME){

      def curlCommand = """
                    curl -v -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} --upload-file artifact.tar.gz ${NEXUS_URL}/repository/${NEXUS_REPO_ID}/${PACKAGE_NAME}/${PACKAGE_NAME}-${env.BUILD_ID}.tar.gz        
              """
         sh curlCommand

}

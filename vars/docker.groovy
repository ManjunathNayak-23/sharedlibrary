def buildAndPush(String IMAGE_NAME,String BUILD_ID,String DOCKERFILE_PATH,String DOCKER_HUB_CREDENTIALS){

  dockerImage = docker.build("${IMAGE_NAME}:${BUILD_ID}", "-f ${DOCKERFILE_PATH} .")
      
                  
                          docker.withRegistry('https://registry.hub.docker.com', "${DOCKER_HUB_CREDENTIALS}") {
                              
                              dockerImage.push()


}
}

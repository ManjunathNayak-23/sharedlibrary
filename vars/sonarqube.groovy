def sonarscan(String credentialsId, String installationName, String projectName, String projectKey) {
  withSonarQubeEnv(credentialsId: credentialsId, installationName: installationName) {
    sh """$SCANNER_HOME/bin/sonar-scanner \
         -Dsonar.projectKey=${projectKey} \
         -Dsonar.projectName=${projectName} \
         -Dsonar.sources=src/ \
         -Dsonar.tests=testresults/junit \
         -Dsonar.java.binaries=target/classes/ \
         -Dsonar.exclusions=src/test/java/**/*.java \
         -Dsonar.java.libraries=/var/lib/jenkins/.m2/**/*.jar \
         -Dsonar.projectVersion=${BUILD_NUMBER}-${GIT_COMMIT_SHORT}"""
  }
}

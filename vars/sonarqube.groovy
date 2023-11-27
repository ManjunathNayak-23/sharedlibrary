def sonarscan(String projectName, String projectKey) {

         echo "Project Name: ${projectName}"
    echo "Project Key: ${projectKey}"
         sh """$SCANNER_HOME/bin/sonar-scanner \
         -Dsonar.projectKey=${projectKey} \
         -Dsonar.projectName=${projectName} \
         -Dsonar.sources=src/ \
         -Dsonar.tests=testresults/junit \
         -Dsonar.java.binaries=target/classes/ \
         -Dsonar.exclusions=src/test/java/****/*.java \
         -Dsonar.java.libraries=/var/lib/jenkins/.m2/**/*.jar \
         -Dsonar.projectVersion=${BUILD_NUMBER}-${env.GIT_COMMIT_SHORT}"""
}

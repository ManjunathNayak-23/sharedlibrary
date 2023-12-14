def scan(String projectName){
  def scannerHome = tool 'sonarqubeMS'
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll begin /k:\"${projectName}\""
      sh "dotnet build"
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll end"




}

def scan(String projectName,String scannerHome){
  def scannerHome = tool '${scannerHome}'
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll begin /k:\"${projectName}\""
      sh "dotnet build"
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll end"




}

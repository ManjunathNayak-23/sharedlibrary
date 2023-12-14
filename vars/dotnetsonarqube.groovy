def scan(String projectName,String scannerName){
  def scannerHome = tool '${scannerName}'
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll begin /k:\"${projectName}\""
      sh "dotnet build"
      sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll end"




}

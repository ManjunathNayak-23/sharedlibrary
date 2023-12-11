def build(){
 
                    sh 'dotnet restore'
                    sh 'dotnet build'

}

def test(){

sh 'dotnet test'

}

def publish(){

sh 'dotnet publish -c Release'
}

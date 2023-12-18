def startService(String SSHCONFIGNAME){

sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/dotnet /opt/ && sudo rm -rf /home/ubuntu/dotnet && cd /home/ubuntu/dotnet/bin/Release/net6.0/ &&  dotnet MongoDBDotNET6.dll",
                                        execTimeout: 120000
                                    )
                                ])
                    ])


}

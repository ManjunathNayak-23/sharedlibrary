def startService(String SSHCONFIGNAME){

sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/bin /opt/ && sudo rm -rf /home/ubuntu/bin && cd /opt/bin/Release/net6.0/ &&  dotnet MongoDBDotNET6.dll",
                                        execTimeout: 120000
                                    )
                                ])
                    ])


}

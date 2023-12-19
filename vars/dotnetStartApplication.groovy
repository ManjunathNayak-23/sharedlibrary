def startService(String SSHCONFIGNAME){

sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                       execCommand: """
                        pidToKill=\$(sudo lsof -t -i:5000) &&
                        kill -9 \$pidToKill &&
                        sudo cp -rf /home/ubuntu/bin /opt/ &&
                        sudo rm -rf /home/ubuntu/bin &&
                        dotnet /opt/bin/Release/net6.0/MongoDBDotNET6.dll
                    """,
                                        execTimeout: 120000
                                    )
                                ])
                    ])


}

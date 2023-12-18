def stopRemove(String SSHCONFIGNAME){

 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo kill -9 $(lsof -t -i:5000) && sudo rm -rf /opt/dotnet/",
                                        execTimeout: 120000
                                    )
                                ])
                    ])

}

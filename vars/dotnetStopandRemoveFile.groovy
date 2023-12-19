def stopRemove(String SSHCONFIGNAME){

 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo rm -rf /opt/dotnet/",
                                        execTimeout: 120000
                                    )
                                ])
                    ])

}

def stopRemove(String SSHCONFIGNAME){

 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo fuser -k 5000/tcp && sudo rm -rf /opt/dotnet/",
                                        execTimeout: 120000
                                    )
                                ])
                    ])

}

def stopRemove(String SSHCONFIGNAME){

 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo kill -9 `netstat -lntp | grep 5060 | awk -F ' ' '{print $NF}' |  awk -F '/' '{print $1}'` && sudo rm -rf /opt/dotnet/",
                                        execTimeout: 120000
                                    )
                                ])
                    ])

}

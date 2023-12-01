def stopRemove(String SSHCONFIGNAME){

 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo systemctl stop nginx && sudo rm -rf /var/www/html/*",
                                        execTimeout: 120000
                                    )
                                ])
                    ])

}

def startService(String SSHCONFIGNAME){

sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/dist/* /var/www/html/ && rm -rf /home/ubuntu/dist && sudo systemctl start nginx",
                                        execTimeout: 120000
                                    )
                                ])
                    ])


}

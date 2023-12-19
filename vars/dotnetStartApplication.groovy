def startService(String SSHCONFIGNAME){

sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                       execCommand: "sudo systemctl stop dotnetapp && sudo cp -rf /home/ubuntu/bin /opt/ && sudo rm -rf /home/ubuntu/bin && sudo systemctl start dotnetapp",
                                        execTimeout: 120000
                                    )
                                ])
                    ])


}

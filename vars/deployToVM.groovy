def startDeploy(String SSHCONFIGNAME){

  
 sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME ,
                        transfers: [sshTransfer(flatten: false, sourceFiles: "dist/**")])
                    ])




}

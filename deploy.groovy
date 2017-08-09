aws {
    profileName = 'cfn-andy'
    region = 'us-east-2'
}

cloudFormation {
    templateFile = project.file('build/cloudformation/artifacts3-repo.yaml')
    stackName = 'artifacts3-repo' // override example: ./gradlew updateStack -PprofileName=new-profile -PstackName=new-name
    capabilityIam true
    conventionMapping.stackParams = {
        return stackParams = [
            DomainName: 'cfn-stacks.com',
            AcmCertificateArn: '',
            HostedZoneId: '',
            OriginAccessIdentity: '',
            OriginAccessUser: ''
        ]
    }
}
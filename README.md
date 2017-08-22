## ArtifactS3 - Artifact Repo on S3

### Features

 * Deployed using [CloudFormation template](https://cfn-stacks.com/docs/artifacts3-repo/latest/index.html#deployment)
 * Expiration of snapshot (dev) releases using S3 lifecycle rules
 * Custom handling of .cfn.jar archives containing CloudFormation templates
    * Unzipped into a versioned templates/ directory by a Lambda function
* Latest stable version [documentation](https://cfn-stacks.com/docs/artifacts3-repo/latest/index.html)
* All CloudFormation Stacks [documentation](https://cfn-stacks.com/docs/index.html)

See the [example application](https://github.com/cfn-stacks/app-example) for an explanation of 
the repo, plugin and workflow
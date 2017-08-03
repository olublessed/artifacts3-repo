## ArtifactS3 - Artifact Repo on S3

 Features:
 * Deployed using CloudFormation
 * CloudFront distribution (CDN) in front of the S3 bucket
 * Expiration of snapshot (dev) releases using S3 lifecycle rules
 * Custom handling of .cfn.jar archives containing CloudFormation templates
    * Unzipped into a versioned templates/ directory by a Lambda function
 
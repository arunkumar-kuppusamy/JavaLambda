# AWS Lambda in Java
A sample implementation of AWS Lambda written in Java with local testing support using [AWS SAM local](https://github.com/awslabs/aws-sam-local).

## Test your AWS Lambda functions locally
```
./gradlew jar && sam local invoke "HelloWorldLambda" -e event.json
``` 

## Setup
* [Docker for Mac](https://docs.docker.com/docker-for-mac/install/), [Docker for Windows or Docker Toolbox](https://docs.docker.com/docker-for-windows/)
* [AWS SAM Local](https://github.com/awslabs/aws-sam-local#installation)

### To install SAM local
```
npm install -g aws-sam-local
```

# AWS Lambda in Java
A sample implementation of AWS Lambda written in Java with local testing support using [AWS SAM local](https://github.com/awslabs/aws-sam-local).

## Test your AWS Lambda functions locally
First run the command bellow will take some time. The docker image for SAM Local with download once (~350MB).
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

## Sample local execution output
```
$ ./gradlew jar && sam local invoke "HelloWorldLambda" -e event.json
Cleaned up directory '/Users/<user>/Documents/JavaLambda/build/classes/main'
:compileJava
:processResources NO-SOURCE
:classes
:jar

BUILD SUCCESSFUL

Total time: 1.323 secs
2018/01/22 22:27:38 Successfully parsed template.yaml
2018/01/22 22:27:38 Connected to Docker 1.35
2018/01/22 22:27:38 Fetching lambci/lambda:java8 image for java8 runtime...
java8: Pulling from lambci/lambda
f338a32fa56c: Already exists
4926b20b634f: Already exists
c3fe0b74303b: Pull complete
f046db74dc8b: Pull complete
Digest: sha256:c27e0bf05c2a269738db5b04c5a02eca4456ad40869bfe7eb06d68bcb92f6ddc
Status: Downloaded newer image for lambci/lambda:java8
2018/01/22 22:27:44 Invoking com.example.javalambda.HelloWorld::handleRequest (java8)
2018/01/22 22:27:44 Decompressing /Users/<user>/Documents/JavaLambda/build/libs/JavaLambda-1.0-SNAPSHOT.jar
2018/01/22 22:27:44 Mounting /private/var/folders/43/_n9h07pj58q2zcl5cvbdyktmhd_n60/T/aws-sam-local-1516656464187027000 as /var/task:ro inside runtime container
START RequestId: ae513807-82f4-47eb-bcdf-362146dc85bd Version: $LATEST
END RequestId: ae513807-82f4-47eb-bcdf-362146dc85bd

"Hello World from Lambda, John Doe from Wakanda."
REPORT RequestId: ae513807-82f4-47eb-bcdf-362146dc85bd	Duration: 19.39 ms	Billed Duration: 100 ms	Memory Size: 0 MB	Max Memory Used: 9 MB
```

## Pro tip
Make sure you set following environment variables to speed-up each local function run.
```
export AWS_ACCESS_KEY_ID=<access key id>
export AWS_SECRET_ACCESS_KEY=<secret access key>
```
~/.aws/config does not help. Has to be the variables.
#We should start with a base image containing Java runtime
FROM openjdk:19-jdk-slim

#info about who maintains this
LABEL maintainer="sreehari.kammari@gmail.com"

#this adds application jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#executes the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]

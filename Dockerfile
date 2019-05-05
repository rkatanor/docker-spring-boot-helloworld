FROM openjdk:8
ADD target/docker-helloworld-0.0.1-SNAPSHOT.jar docker-helloworld.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-helloworld.jar"]
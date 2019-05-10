FROM openjdk:8
ADD target/docker-helloworld-2.1.4.RELEASE.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:8
ADD target/docker-spring-boot.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]

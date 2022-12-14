FROM  openjdk:17-jdk-slim-buster
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]
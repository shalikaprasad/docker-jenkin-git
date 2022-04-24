FROM openjdk:8-alpine
ADD target/spring-mysql-0.0.1-SNAPSHOT.jar spring-mysql.jar
ENTRYPOINT [ "java" , "-jar", "spring-mysql.jar"]

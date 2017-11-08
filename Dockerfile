FROM openjdk:8-jdk-alpine

ADD target/Api-Gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8787
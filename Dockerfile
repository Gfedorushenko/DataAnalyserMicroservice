FROM maven:3.8.5-opnenjdk-11 AS
COPY /src /src
COPY pom.xml
RUN mvn -f /pom.xml clean package

FROM openjdk:11-jdk-slim
COPY --from=build /target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
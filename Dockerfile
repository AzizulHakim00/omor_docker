# Java 26 runtime
FROM eclipse-temurin:26-jre-alpine

# Application directory
WORKDIR /app

# Copy the Spring Boot JAR
COPY target/practice_docker-0.0.1-SNAPSHOT.jar app.jar

# Spring Boot port
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]

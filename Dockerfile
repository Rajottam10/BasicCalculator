FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the built jar file
COPY target/BasicCalculator-1.0-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
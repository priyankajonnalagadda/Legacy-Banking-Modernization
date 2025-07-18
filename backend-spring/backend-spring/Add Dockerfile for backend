# Use official OpenJDK as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file into the container
COPY target/banking-backend.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

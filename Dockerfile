# Use a lightweight OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the fat JAR into the container
COPY target/assignment-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

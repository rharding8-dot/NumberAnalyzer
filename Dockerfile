# Use a lightweight Java image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/NumberAnalyzer-1.0-SNAPSHOT.jar app.jar

# Set the command to run your JAR
ENTRYPOINT ["java", "-jar", "app.jar"]

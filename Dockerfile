# Use a base image with Java 17 installed
FROM adoptopenjdk:17-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/demo.jar /app/demo.jar

# Expose the port on which your Spring Boot application listens
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "demo.jar"]

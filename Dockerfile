# Use the Maven image to build and run the application
FROM maven:3.8.5-openjdk-17-slim
# Set the working directory
WORKDIR /app
# Copy the project files into the container
COPY . .
# Expose the application ports
EXPOSE 8080
# Run the Spring Boot application using Maven
CMD ["mvn", "spring-boot:run"]
## Spring Boot Project Three-Layer Architecture  
Presentation layer/API Layer: This is the user interface of the application that presents the application’s features and data to the user.  
  
Business/Service layer: This layer contains the business logic that drives the application’s core functionalities. Like making decisions, calculations, evaluations, and processing the data passing between the other two layers.  
  
Data access object (DAO) layer: This layer is responsible for interacting with databases to save and restore application data.  
  
Example: "demo" project  


## Dockerizing a Spring Boot Application

FROM: As the base for our image, we'll take the Java-enabled Alpine Linux created in the previous section.  
COPY: We let Docker copy our jar file into the image.  
ENTRYPOINT: This will be the executable to start when the container is booting. We must define them as JSON-Array because we'll use an ENTRYPOINT in combination with a CMD for some application arguments.  

Dockerfile =[docker build]=> Docker image =[docker run]=> Docker container  

FROM openjdk:17
ADD ./user-microservice-0.1.0.jar user-microservice-0.1.0.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "user-microservice-0.1.0.jar"]


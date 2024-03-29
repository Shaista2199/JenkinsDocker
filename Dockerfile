FROM openjdk:8
EXPOSE 8081
ADD target/SpringBootAssignment.jar SpringBootAssignment.jar
ENTRYPOINT ["java","-jar","/SpringBootAssignment.jar"]
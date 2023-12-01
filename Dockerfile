FROM openjdk:17alpine
ADD target/jar EXAMPLE.jar
ENTRYPOINT ["JAVA","-jar","EXAMPLE.jar"]
EXPOSE:8080
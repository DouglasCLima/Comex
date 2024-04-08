FROM openjdk:17
WORKDIR /app
COPY target/apirest-0.0.1-SNAPSHOT.jar /app/apirest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "apirest-0.0.1-SNAPSHOT.jar"]
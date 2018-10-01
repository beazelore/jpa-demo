FROM openjdk:10
ADD target/JPAdemo-0.0.1-SNAPSHOT.jar JPAdemo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "JPAdemo-0.0.1-SNAPSHOT.jar"]
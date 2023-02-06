FROM openjdk:11
ADD target/weatherMonitoring-0.0.1-SNAPSHOT.jar /weatherMonitoring.jar
EXPOSE 8080
CMD ["java", "-jar","/weatherMonitoring.jar"]
ENV TZ Europe/Moscow

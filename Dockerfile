FROM adoptopenjdk:11-jre-hotspot
ADD target/weatherMonitoring-0.0.1-SNAPSHOT.jar /weatherMonitoring.jar
ENTRYPOINT ["java", "-jar","/weatherMonitoring.jar"]
EXPOSE 8082
ENV TZ Europe/Moscow

FROM openjdk:19
EXPOSE 8080
COPY target/tweetapp-0.0.1-SNAPSHOT.jar springapp.jar
ENTRYPOINT ["java","-jar","/springapp.jar"]
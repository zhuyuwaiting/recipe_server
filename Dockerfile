#FROM java:8
#VOLUME /tmp
#ADD recipe_manage-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#EXPOSE 8080
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM maven:3.5-jdk-8
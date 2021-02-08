FROM java:8-jdk

RUN mkdir /app

WORKDIR /app

COPY target/user-service-0.0.1-SNAPSHOT.jar /app

EXPOSE 8110

CMD ["--spring.profiles.active=gcp"]

ENTRYPOINT ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]


FROM amazoncorretto:24.0.1-alpine3.21
LABEL authors="humbert0, eder117"
WORKDIR /app
COPY ./target/Formula1-0.0.1-SNAPSHOT.jar ./Formula1.jar
EXPOSE 8080
CMD ["java", "-jar", "./Formula1.jar"]
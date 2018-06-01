FROM openjdk:8
ADD target/chiragh-mysql.jar  chiragh-mysql.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "chiragh-mysql.jar"]
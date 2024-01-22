FROM openjdk:17
COPY build/libs/user-service-implementation.jar /user-service.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/user-service.jar"]
EXPOSE 8080

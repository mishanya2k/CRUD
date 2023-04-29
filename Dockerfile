FROM openjdk:11
EXPOSE 8080
ADD /gradle/wrapper/gradle-wrapper.jar backed.jar
ENTRYPOINT ["java","-jar","/backend.jar"]


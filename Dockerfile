FROM java:8-jre
WORKDIR /
USER daemon
ADD hello.jar /app/hello.jar
ENTRYPOINT [ "java", "-jar", "/app/hello.jar" ]
EXPOSE 8080
EXPOSE 8888

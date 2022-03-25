FROM openjdk:11
EXPOSE 8080
ADD target/ws_helm_example.jar ws_helm_example.jar
ENTRYPOINT exec java -jar ws_helm_example.jar
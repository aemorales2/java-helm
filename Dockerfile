FROM us-central1-docker.pkg.dev/jbh-prd-devops/jbh-images/jbh-alpine-jre11
EXPOSE 8080
ADD target/ws_helm_example.jar ws_helm_example.jar
ENTRYPOINT exec java -jar ws_helm_example.jar
FROM openjdk:8
EXPOSE 8090
ADD target/kubernetes-example.jar kubernetes-example.jar
ENTRYPOINT [ "java","-jar", "/kubernetes-example.jar" ]
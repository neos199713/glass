FROM java:8
EXPOSE 8090
ADD /target/gestion-voyages-client-1.0.jar gestion-voyages-client.jar
ENTRYPOINT ["java","-jar","gestion-voyages-client.jar"]
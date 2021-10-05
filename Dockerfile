FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD build/libs/controle-financeiro-config-server-0.0.1-SNAPSHOT.jar controle-financeiro-config-server.jar
ENTRYPOINT ["java","-jar","/controle-financeiro-config-server.jar"]
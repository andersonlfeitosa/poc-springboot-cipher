FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservicos
ADD maven/poc-cipher.jar /opt/microservicos/poc-cipher.jar
ADD local_policy.jar /usr/lib/jvm/java-1.8-openjdk/jre/lib/security
ADD US_export_policy.jar /usr/lib/jvm/java-1.8-openjdk/jre/lib/security
WORKDIR /opt/microservicos
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-cipher.jar"]


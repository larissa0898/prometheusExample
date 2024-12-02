# Verwende ein OpenJDK-Image
FROM openjdk:17-jdk-slim

# Arbeitsverzeichnis im Container setzen
WORKDIR /app

# Kopiere die JAR-Datei (die du mit `mvn clean package` gebaut hast) in das Arbeitsverzeichnis
COPY target/prometheus_HA-0.0.1-SNAPSHOT.jar /app/prometheus_HA-0.0.1-SNAPSHOT.jar

# Führe die Spring Boot-Anwendung aus
CMD ["java", "-jar", "prometheus_HA-0.0.1-SNAPSHOT.jar"]

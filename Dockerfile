# Etapa 1: Construir con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiam0s pom y dependencias primero para cache
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código
COPY src ./src

# Construir el proyecto

RUN mvn package -DskipTests

# Etapa 2: Ejecutar la aplicación
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/calculadora-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

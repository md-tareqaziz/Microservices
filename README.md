# Microservices

## List of Apps
- Registry Service
- Config Service
- Gateway Service
- Employee Service
- Project Service

### Registry Service
Eureka Server is used as a registry service. It is from *spring-cloud*. It allows services to find and communicate with each other without hard-coding the hostname and port.

### Config Service
In order to pulling configuration config service is used. Every app load there configuration from config service on startup. It is from *spring-cloud*.
All configuration are in github. [Configurations](https://github.com/md-tareqaziz/Configurations) 

### Gateway Service
Like it's name Gateway service is used as a Gateway.
  - Spring Security used to authorization.
  - Keycloak is used as a authorization service.
  - All app need to access through it.

### Employee Service
Employee service is a demo REST API here to access employee info from database. 

### Project Service
Project service is a demo REST API here to access project info from database.

## Instruction
mvn clean package will build a docker image in hte local machine for all application.
There are two docker-compose file
  - docker-compose-env will up all the depended services Like (Keycloak, Postgres, Redis).
  - docker-compose-apps will up all demo apps.

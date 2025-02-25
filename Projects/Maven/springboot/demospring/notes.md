# Spring Boot Project 
- **Spring Boot** is an extension of the Spring framework that simplifies the setup and development of new Spring applications.
- It provides a convention-over-configuration approach, allowing developers to create stand-alone, production-grade applications quickly.

## Key Features
- **Auto-Configuration**: Automatically configures Spring applications based on the dependencies present on the classpath.
- **Embedded Server**: Includes embedded servers (like Tomcat, Jetty) to run applications without needing external server installations.
- **Production-Ready**: Offers built-in features like metrics, health checks, and externalized configuration for production environments.

## Application Properties
- Configuration settings are typically stored in src/main/resources/application.properties or application.yml.
- Example [application.yml](Maven/springboot/springboot/src/main/resources/application.yml)
```bash
spring:
  thymeleaf.cache: false
  main.show-banner: false
application:
    name: Demo
datasource:
    postgresql
...
```
## Initialize
- Initialize a new Project from IDE or use [Spring Initializr](https://start.spring.io)

## Running 
- Run from Project folder
``mvn spring-boot:run`` or with wrapper ``mvn spring-boot:run``
- SpringBoot app automatically starts a TomCat server on ``localhost:8080``
```bash
o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path
```

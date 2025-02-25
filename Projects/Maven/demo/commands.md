# Maven Project 
- **Maven** is a build automation and dependency management tool primarily used for Java projects.
- It simplifies the process of managing project builds, dependencies, and documentation.
## Tutorial
- https://youtu.be/Xatr8AZLOsE

## How it works? 
- It downloads all the dependencies from a remote repository managed by Maven devs
```bash 
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/3.3.8/spring-boot-buildpack-platform-3.3.8.pom
```
## Key Features of Maven
- **Dependency Management**: Automatically downloads and manages libraries and dependencies required for your project.
- **Build Automation**: Provides a standard way to build projects, including compiling code, packaging binaries, running tests, and deploying applications.
- **Project Management**: Offers a consistent project structure and lifecycle, making it easier to manage large projects.

## Compiler
- Maven uses a plugin system to handle the compilation of Java code.
- The default compiler plugin is `maven-compiler-plugin`, which compiles the source code and can be configured to specify the Java version.
### Pom.xml
- Example configuration in `pom.xml`:
  ```xml
  <project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.cyrils.demo</groupId>
    <artifactId>demo</artifactId>
    <version>1.0-SNAPSHOT</version><!-- version of your app (Dev,Alpha,Snapshot) -->

    <properties>
        <maven.compiler.source>17</maven.compiler.source> <!-- what Java ver. you want to run the project -->
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
  ```

## Maven Wrapper
- Maven Wrapper `(mvnw)` allows running Maven without installation, ensuring version consistency.
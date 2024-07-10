# SpringBoot



## initialise springboot
after launching the dev environment.
access the Command Palette using the shortcut(Ctrl+shift+P).

```txt
type "Spring Initializr: Generate a Maven Project" and enter it.
```

[How to Build Spring Boot Project in VSCode?](https://www.geeksforgeeks.org/how-to-build-spring-boot-project-in-vscode/)


### Project Metadata Fields

Project: Maven
Language: Java
Spring Boot: 3.3.2

Group: com.example
Artifact: gdp-car-rego-backend
Name: Car Registration Tracker
Description: Internal website for tracking the status of registered cars in the business fleet.
Package name: com.example.carregistrationtracker

Packaging: Jar
Java: 17

Dependencies:

-   **Lombok**  
    Java annotation library which helps to reduce boilerplate code.

-   **Spring Boot DevTools**  
    Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

-   **Docker Compose Support**  
    Provides docker compose support for enhanced development experience.

-   **Spring Configuration Processor**  
    Generates metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (e.g., `application.properties`/`.yml` files).

-   **PostgreSQL Driver**  
    A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database-independent Java code.

-   **Spring Data JPA**  
    Persists data in SQL stores with Java Persistence API using Spring Data and Hibernate.

-   **Spring REST Docs**  
    Documents RESTful services by combining hand-written with Asciidoctor and auto-generated snippets produced with Spring MVC Test.

-   **Spring Web**  
    Builds web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

### folder structure
move the `springboot application files` from its `folder` and place at `root of project`

```sh
.
├── compose.yaml
├── Dockerfile
├── docs
│   ├── install-springboot.md
│   └── pipeline.md
├── HELP.md
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── car_registration_tracker
│   │   │               └── CarRegistrationTrackerApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── car_registration_tracker
│                       └── CarRegistrationTrackerApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── example
    │           └── car_registration_tracker
    │               └── CarRegistrationTrackerApplication.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    └── test-classes
        └── com
            └── example
                └── car_registration_tracker
                    └── CarRegistrationTrackerApplicationTests.class

```


## Springboot configure a data source

When you start a new Spring Boot project, Spring Boot attempts to automatically configure a data source by default. If this is not configured you will encounter an error because no database configuration is provided.

### disable the data source auto-configuration
`src/main/resources/application.properties`

```java
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
```

### configure data source
```java
# point to postgress container
spring.datasource.url=jdbc:h2:mem:crud
```

## Structure project
see linked [Rest API Design](./rest-api-structure.md)

# Resources
[DEWC Springboot crud](https://github.com/dewcservices/GDP-02a_Springboot_REST_Backend?tab=readme-ov-file)
[Software Engineering Challenge](https://github.com/r3aper89/restAPIchallge/tree/challange2/SoftwareEngineeringChallenge/src/main/java/com/crud/SoftwareEngineeringChallenge)
# gdp-car-rego-backend

This repository contains the backend code for the Car Registration Tracker project.

## Prerequisite

create docker network for gdp-car-rego-backend and gdp-car-rego-database to talk too

```sh
docker network create gdp-car-rego
```

start gdp-car-rego-database
start this devcontainer

## open devcontainer

open command pallet (`F1` or `CTRL + P`)
select: `Dev containers: reopen in devcontainer`

OR
command pallet
`>Dev Containers: Install devcontainer CLI`

```sh
devcontainer up
```

## Run App

```sh
mvn spring-boot:run
```

## Access Swagger UI

[swagger UI](http://localhost:8080/swagger-ui.html)
[api doc json](http://localhost:8080/api-docs)

# CI/CD Pipeline

Follow [DevSecOps Pipelines](https://github.com/dewcservices/devsecops/tree/main) to add to pipeline.

copy the `maven-pipeline/.github` to `./` (root of project).

## [DOCKERHUB_TOKEN](https://hub.docker.com/settings/security)

-   generate `New Access Token`
-   Access token description `gdp-car-rego-backend`
-   copy to clipboard

## [SONAR_TOKEN](https://sonarcloud.io/organizations/)

My account > Security > Generate Tokens
name: `gdp-car-rego-backend`

-   copy to clipboard

## add Secrets and variables to github repository

Settings > Secrets and variables > Actions:

DOCKERHUB_TOKEN

-   paste `Access Token`

DOCKERHUB_USERNAME:

-   use dockerhub user name

SONAR_TOKEN

-   pate `generated token`

# .github/workflows/maven.yml

env:
DOCKER_IMAGE_NAME: "gdp-docker-img-backend"
SONAR_ORGANIZATION: "r3aper89"
SONAR_PROJECT_KEY: "car-registration-tracker"

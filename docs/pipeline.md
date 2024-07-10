# CI/CD Pipeline Setup

This guide provides instructions to set up a CI/CD pipeline using GitHub Actions to build a Docker image and push it to DockerHub, as well as integrate SonarCloud for code quality analysis.

## Prerequisites

1. DockerHub account
2. SonarCloud account
3. GitHub repository

## Step 1: DockerHub Setup

1. Log in to your [DockerHub](https://hub.docker.com/settings/security) account.
2. Generate a new access token:
    - Click on `New Access Token`.
    - Description: Enter your repository name.
    - Copy the generated token. This will be referred to as `[DOCKERHUB_TOKEN]`.

## Step 2: SonarCloud Setup

1. Log in to your [SonarCloud](https://sonarcloud.io/projects/create/) account.
2. Analyze a new project:
    - Click `+` in the navbar and select `Analyze new projects`.
    - Organization: Enter your SonarCloud account name. This will be referred to as `[SONAR_ORGANIZATION]`.
    - Display Name: Enter your repository name.
    - Project Key: Copy the generated key. This will be referred to as `[SONAR_PROJECT_KEY]`.
    - Set project visibility to `Public`.
    - Click `Next`.
    - For the new code base, select `Previous version`.
    - Click `Create project`.
    - Choose your analysis method: Select `GitHub Actions`.
    - Create a GitHub secret: Go to your GitHub repository, navigate to `Settings > Secrets > Actions`, and create a new secret:
        - Name: `SONAR_TOKEN`
        - Value: Copy and paste the generated token.

## Step 3: GitHub Secrets Configuration

1. Navigate to your GitHub repository's `Settings > Secrets and variables > Actions`.
2. Add the following secrets:

    - `DOCKERHUB_TOKEN`: Paste the DockerHub access token.
    - `DOCKERHUB_USERNAME`: Enter your DockerHub username.
    - `SONAR_TOKEN`: Paste the SonarCloud token.

## Step 4: GitHub Workflow Configuration

1. Copy the contents of the `maven-pipeline/.github` folder to the root of your project.
2. Edit the `.github/workflows/maven.yml` file with the following environment variables:

    ```yaml
    env:
        DOCKER_IMAGE_NAME: "your-docker-image-name"
        SONAR_ORGANIZATION: "your-sonarcloud-account-name"
        SONAR_PROJECT_KEY: "your-generated-project-key"
    ```

## Step 5: Commit Message Standards

-   Follow the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) specification.
-   Use lowercase letters.
-   Limit commit messages to 100 characters.

By following these steps, you will set up a CI/CD pipeline using GitHub Actions to build and push a Docker image to DockerHub and integrate SonarCloud for code quality analysis.

# use microsoft java image
FROM mcr.microsoft.com/vscode/devcontainers/java:17

# Install Maven
RUN apt-get update && apt-get install -y maven

# Expose port 8080
EXPOSE 8080


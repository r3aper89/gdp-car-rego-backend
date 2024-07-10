# java 17 dev container environment

## open devcontainer

open command pallet (`F1` or `CTRL + P`)
select: `Dev containers: reopen in devcontainer`

setup springboot project follow
https://start.spring.io/

## `.devcontainer/devcontainer.json`

This is a devcontainer.json file used for setting up a development container in Visual Studio Code.

The name field specifies the name of the development container.
The build field specifies the Dockerfile to use for building the container.
The customizations field is used to configure properties specific to VS Code.
The forwardPorts field specifies the list of ports inside the container that should be forwarded to the local machine.
The remoteUser field specifies the user to connect to the container as.
The commented out sections in the build field are for specifying additional build arguments such as the Java version, OS version, and whether to install Maven and Gradle.

The extensions field in the customizations field specifies the list of extensions to be installed in the container when it is created.

The postCreateCommand field is commented out and can be used to run commands after the container is created.

The remoteUser field is commented out and can be used to connect to the container as root instead of the default vscode user.

## `Dockerfile`

This Dockerfile is based on the mcr.microsoft.com/vscode/devcontainers/java:17 image. It sets up a Java development environment.

The commented out sections are options for installing Maven and Gradle. These options can be uncommented and customized to install specific versions of Maven and Gradle.

The [Choice] Node.js version section allows you to specify the version of Node.js to install. By default, it is set to "none", but you can choose from "lts/\*", 16, 14, 12, or 10.

The [Optional] Uncomment this section to install additional OS packages section allows you to install additional OS packages. Uncomment this section and modify the command to install the desired packages.

The [Optional] Uncomment this line to install global node packages section allows you to install global Node.js packages. Uncomment this section and modify the command to install the desired packages.

Overall, this Dockerfile sets up a Java development environment with optional Maven, Gradle, Node.js, and additional OS packages.

### ref:

https://github.com/microsoft/vscode-dev-containers/tree/main/containers/java


## extensions 

Gitlens enable interactive editor is activated in the devcontiainer settings this allows gui rebase and squash. 

in terminal

# How to clone
```sh
git clone https://github.com/concertypin/template -b azure-function-java
```
# How to build
```sh
gradle installDist
```
# How to run
```sh
build/install/${projectName}/bin/${projectName}
```
# How to deploy
```sh
func azure functionapp publish ${azureFunctionAppName}
```

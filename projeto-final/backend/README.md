# Projeto Backend

Após ler o enunciado disponível [aqui](../README.md "DESAFIO DEVELOP UP STEFANINI"), você poderá seguir este tutorial para ver os procedimentos necessários para rodar o projeto backend.

Antes, verifique [nosso guia](https://developup.stefanini.com.br/git/developup/requisitos#desafio-develop-up-stefanini "Guia de Instalação dos programas necessários") para ver se você tem todos os requisitos para rodar o programa.
Se você tiver alguma dúvida na instalação do ambiente abra uma [issue](https://developup.stefanini.com.br/git/developup/requisitos/-/issues "Issue para duvidas relacionados a configuração do ambiente").


## Rodando a aplicação backend

Você tem duas formas de rodar o programa: a primeira é usando o maven embutido no projeto da seguinte forma, lembrando que o terminal deve estar com a pasta aberta no backend, normalmente usando o comando cd backend.
- Windows
```shell script
mvnw compile quarkus:dev
```
 - Linux
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Para usar o maven do projeto as variáveis de ambiente deverão estar configuradas, exemplo JAVA_HOME

A outra forma é usando um maven externo do projeto ou fornecido pela sua IDE.

## Acessando a API

Esta API expõe o swagger, que além de outras coisas serve como documentação para o desenvolvedor ver como e quais endpoints estão disponíveis, e poder testar a api sem depender do frontend.
- http://localhost:8080/explorer/

## Rodando os testes
Para a realização dos testes fique atendo a estrutura de onde cada Classe deve ficar. Além disso é necessário rodar o seguinte comando para rodar os testes.
```shell script
./mvnw test
```
### Estrutura do Projeto
📦src\
┣ 📂main\
┃ ┣ 📂java\
┃ ┃ ┗ 📂br\
┃ ┃ ┃ ┗ 📂com\
┃ ┃ ┃ ┃ ┗ 📂stefanini\
┃ ┃ ┃ ┃ ┃ ┣ 📂config\
┃ ┃ ┃ ┃ ┃ ┣ 📂dao\
┃ ┃ ┃ ┃ ┃ ┣ 📂dto\
┃ ┃ ┃ ┃ ┃ ┣ 📂exceptions\
┃ ┃ ┃ ┃ ┃ ┣ 📂models\
┃ ┃ ┃ ┃ ┃ ┣ 📂rest\
┃ ┃ ┃ ┃ ┃ ┣ 📂services\
┃ ┗ 📂resources\
┃ ┃ ┣ 📂scripts\
┗ 📂test\
┃ ┣ 📂java\
┃ ┃ ┗ 📂br\
┃ ┃ ┃ ┗ 📂com\
┃ ┃ ┃ ┃ ┗ 📂stefanini\
┃ ┗ 📂resources\
┃ ┃ ┣ 📂schemas\
┃ ┃ ┗ 📂scripts\

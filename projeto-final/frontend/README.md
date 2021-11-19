# Projeto Frontend

Após ler o enunciado disponível [aqui](../README.md "DESAFIO DEVELOP UP STEFANINI"), você poderá seguir este tutorial para ver os procedimentos necessários para rodar o projeto Frontend.

Antes, verifique [nosso guia](https://developup.stefanini.com.br/git/developup/requisitos#desafio-develop-up-stefanini "Guia de Instalação dos programas necessários") para ver se você tem todos os requisitos para rodar o programa.
Se você tiver alguma dúvida na instalação do ambiente abra uma [issue](https://developup.stefanini.com.br/git/developup/requisitos/-/issues "Issue para duvidas relacionados a configuração do ambiente")


## Rodando a aplicação Frontend

Você precisa rodar dois comandos no front para conseguir subir o projeto, o primeiro apenas a primeira vez.
- instalação das Dependências
```shell script
npm install
```
- Linux
```shell script
npm start
```

## Acessando o frontend
O frontend vai rodar na porta padrão 4200
- http://localhost:4200/

## Rodando os testes
Para a realização dos testes fique atento a estrutura de onde cada Classe deve ficar. Além disso é necessário rodar o seguinte comando para rodar os testes.
```shell script
npm run test
```
### Estrutura do Projeto
📦src\
┣ 📂app\
┃ ┣ 📂cadastro\
┃ ┃ ┣ 📜cadastro.component.css\
┃ ┃ ┣ 📜cadastro.component.html\
┃ ┃ ┣ 📜cadastro.component.spec.ts\
┃ ┃ ┗ 📜cadastro.component.ts\
┃ ┣ 📂Objetos\
┃ ┃ ┗ 📜pessoa.ts\
┃ ┣ 📂service\
┃ ┃ ┣ 📜cadastro.service.spec.ts\
┃ ┃ ┗ 📜cadastro.service.ts\


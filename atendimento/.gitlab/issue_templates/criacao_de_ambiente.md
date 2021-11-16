#Atendimento de Criação de servidor
**importante:**
Antes de abrir esta issue, verifique se o bug já foi reportado em outro projeto.

#Dados do Criação de servidor
estrutura de um gitlab-ci.yml:
``` 
navegador:
  - build
#  - publicacao
  - execucao

image: docker:dind

services:
  - docker:dind
before_script:
  - docker info
  - docker login -u $DOCKER_LOGIN -p $DOCKER_SENHA
buildar-imagem:
  stage: build
  script:
    - docker build -t minha-imagem .
    - docker tag minha-imagem $DOCKER_LOGIN/minha-imagem:stable
    - docker push $DOCKER_LOGIN/minha-imagem:stable

#publicar-imagem:
#  stage: publicacao
#  script:
#    - docker push $DOCKER_LOGIN/minha-imagem:stable

rodar-imagem:
  stage: execucao
  script:
    - docker run -e MEUNOME=$DOCKER_LOGIN --rm $DOCKER_LOGIN/minha-imagem:stable
```
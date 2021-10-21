# Docker
Docker: tecnologia que permite aos desenvolvedores empacotar, entregar e executar aplicações em containers

Container: um "ambiente isolado"

Container Image: imagem que é usada no container e que contém tudo o que é preciso para correr a aplicação (dependencias, confs, scripts, etc), bem como variáveis de ambiente para o container

Dockerfile deve ter este nome e nenhuma extensão associada

List all containers: docker ps -q
Kill all containers: docker kill $(docker ps -q)
Parar container: docker container stop containerID

Mapeamento de portos: 5432:5432 -> host:imagem

docker run 	-d 					-> correr em segundo plano
		    -r 					-> remove o container quando ele é terminado
		    -v local:container 			-> pasta do host:/var/lib/postgresql/data
		    -e POSTGRES_PASSWORD='DOCKER'		-> define variável de ambiente


Criar container:
1) criar dockerfile
2) criar a app (app.py e requirements.txt)
3) dar build à app
$ docker build --tag=test123
4) correr a app
$ docker run -d -p 80:80 test123

Portainer: aplicação web que facilita a gestão de containers docker


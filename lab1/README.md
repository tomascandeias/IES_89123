NMEC: 89123  
Nome: Tomás Candeias  
Curso: LEI  

Todas as notas relevantes para cada exercicio foram adiconadas na sua pasta no ficheiro readme.md

# Questões de revisão

## A) Maven has three lifecycles: clean, site and default. Explain the main phases in the default lifecycle.

O lifecycle default tem a responsabilidade de fazer o deployment do projeto. Identificamos assim diferentes fases desse ciclo:
1) validate: verifica se toda a informação necessaria para dar build esta disponivel
2) compile: compila todo o codigo do projeto
3) test: corre testes usando unit testing frameworks adequadas
4) package: compila o codigo para formatos distribuiveis (.jar)
5) verify: corre verificações para confirmar se a package é válida
6) install: instala a package no repositorio local
7) deploy: copia a package para o repositorio remoto


## B) Maven is a build tool; is it appropriate to run your project to?

O Maven Build Tool é apropriado e facilita o trabalho do desenvolvedor quando existem muitas dependencias, quando essas dependencias sofrem updates regularmente (maven facilita com o ficheiro POM), toda a parte de integracao, testes, compilar codigo e compilar o package para um jar file fica mais fácil e acessível usando o Maven.

## C) What would be a likely sequence of Git commands required to contribute with a new feature to a given project? (i.e., get a fresh copy, develop some increment, post back the added functionality)

$ git pull --atualizar o noso repositorio local com as alteracoes postadas no remoto 
Nota: lidar com eventuais conflitos antes de dar commit 
$ git add newchanges.txt  
$ git commit -m "newchanges for the X product"  
$ git push  

## D) There are strong opinions on how to write Git commit messages... Find some best practices online and give your own informed recommendations on how to write good commit messages (in a teamproject).

As mensagens de commit devem ser simples e sucintas (não mais de 80-100 caracteres), ou seja, temos sempre que ter em mente que outra pessoa que leia o commit tem que perceber exatamente o que fizemos a mais ou alteramos sem ter a necessidade de ver o código. Boas mensagens de commit em ambiente de desenvolvimento com multiplas pessoas são fundamentais para a eficiencia e produtividade da equipa.
Deste modo, os commits devem ser regulares e completos, não devendo dar commit a partes inacabadas.

## E) Docker automatically prepares the required volume space as you start a container. Why is it important that you take an extra step configuring the volumes for a (production) database?

Se queremos ter persistência numa base dados a correr num container, usamos volumes para mapear uma localização no disco do host numa localização no container. Desta forma, as leituras/escritas do container são feitas no host, e assim os dados não estão dependentes da execucação do mesmo, garantindo a que a base de dados no container tem persistência.
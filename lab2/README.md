NMEC: 89123  
Nome: Tomás Candeias  
Curso: LEI  
  
Todas as notas relevantes para cada exercicio foram adiconadas na sua pasta no ficheiro readme.md  

# Questões de revisão

### A) What are the responsibilities/services of a “servlet container”?  

Quando um servlet é chamado, o web server passa o HTTP request para o servlet container, e o container por sua vez passa ao servlet.Logo, o servlet container dá ao servlet o acesso às propriedades do HTTP request, como por exemplo parametros.  

### B) Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)  
  
O controller tem como função ligar o model à view, sendo que os models possam ser representados nas views. Deste modo, uma view é responsável pela interface que é apresentada na aplicação web, mostrando informações do model ao utilizador. O model contem os dados da aplicação, faz bem como o acesso mas também manipulação dos dados.  

### C) Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?

Os starters organizam as dependências, deste modo todas as dependências daquele starter são automaticamente importadas quando se colocar o seu nome no POM.xml, fá-lo assim de uma forma muito simple e conveniente de usar. Como por exemplo, o spring-boot-starter-web é usado para a construção de web apps e tem como dependências transitivas o spring-boot-starter-validation.  

### D) Which annotations are transitively included in the @SpringBootApplication?  

@SpringBootApplication adiciona:  
@Configuration marca a classe como fonte de bean definitions para o application context.  
@EnableAutoConfiguration diz ao Spring Boot para adicionar beans based no classpath settings, outros beans, e várias definições de propriedades.  
@ComponentScan diz ao Spring Boot para procurar por componentes, configurações e serviços no com/example package, deixando-o encontrar os controladores.  

### E) Search online for the topic “Best practices for REST APIdesign”. From what you could learn, select your “top 5”practices,and briefly explain them in you own words.  

Aceitar e responder com JSON, pois não só é o standard para transferência de dados, mas como é suportado por quase todas as tecnologias.  
Fazer uma boa documentação da API, sendo a melhor maneira para os consumers saberem como usá-la da forma mais correta.  
Usar SSL (Secure Socket Layer) por questões de segurança, de forma a prevenir ataques maliciosos, tornando a REST API mais segura.  
Usar sorting, paginação e filtros, pois por vezes a base de dados pode ser grande e fica muito demorado o seu acesso, utilizando filtros as ações podem ser realizadas numa coleção da REST API.  
Na gestão de erros deve-se usar o status code para ajudar o consumer a saber o que aconteceu, por exemplo entre o 400-499 significa erros na parte do cliente, como 404 quando o recurso não é encontrado.  

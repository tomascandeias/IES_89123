NMEC: 89123  
Nome: Tomás Candeias  
Curso: LEI  
  
Todas as notas relevantes para cada exercicio foram adiconadas na sua pasta no ficheiro readme.md  

# Questões de revisão

### A) What are the responsibilities/services of a “servlet container”?  

Quando um servlet é chamado, o web server passa o HTTP request para o servlet container, e o container por sua vez passa ao servlet.Logo, o servlet container dá ao servlet o acesso às propriedades do HTTP request, como por exemplo parametros.  

### B) Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)  

### C) Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?

### D) Which annotations are transitively included in the @SpringBootApplication?  

@SpringBootApplication adiciona:  
@Configuration marca a classe como fonte de bean definitions para o application context.  
@EnableAutoConfiguration diz ao Spring Boot para adicionar beans based no classpath settings, outros beans, e várias definições de propriedades.  
@ComponentScan diz ao Spring Boot para procurar por componentes, configurações e serviços no com/example package, deixando-o encontrar os controladores.  

### E) Search online for the topic “Best practices for REST APIdesign”. From what you could learn, select your “top 5”practices,and briefly explain them in you own words.  

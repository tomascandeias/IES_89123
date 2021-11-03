# Spring boot  
  
In Spring’s approach to building web sites, HTTP requests are handled by a controller. You can easily identify the controller by the @Controller annotation.  
  
A View is responsible for rendering the HTML content.  
  
Por default o Spring Boot tem o conteúdo estático no /static  
Exemplo: src/main/resources/static/index.html  
  
### WebApp GreetingController.java explicação das anotações:  
@GetMapping garante que os HTTP GET requests para /greetings são mapeados para o método greeting()  
@RequestParam liga o valor da query string param ao name param do método greeting(). Não é obrigatória, se não tiver no request o defaultValue World é usado. O valor do name param é adicionado ao objeto Model, fazendo-o acessível para a view template.  
  
### WebApp ServingWebContentApplication.java explicação das anotações:  
@SpringBootApplication adiciona:  
@Configuration marca a classe como fonte de bean definitions para o application context.  
@EnableAutoConfiguration diz ao Spring Boot para adicionar beans based no classpath settings, outros beans, e várias definições de propriedades.  
@ComponentScan diz ao Spring Boot para procurar por componentes, configurações e serviços no com/example package, deixando-o encontrar os controladores.  
  

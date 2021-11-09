### Esquema
@Repository  
Spring data             SpringBoot  
    |  
JPA + Hibernate         Java + ORM  
    |  
JDBC (API+Driver)       Java  
    |  
Database  

### @Entity  
user{...}, objetos que podem ser gravados e cujo ciclo de vida deve ser gerido pelo ORM  

### @Repository  
<user,long>, user é a entity e long é o id  

## b)

### The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?  
A anotação @Autowired no construtor do UserController diz ao sprinboot para lhe arranjar uma instância do tipo UserRepository.

### List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?  


### Where is the databeing saved?  


### Where is the rule for the “not empty” email address defined?  

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
crudrepository<user,long> -> atua sobre entidades do tipo user e cada user é identificado por um long  

## b)

### The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?  
A anotação @Autowired no construtor do UserController diz ao sprinboot para lhe arranjar uma instância do tipo UserRepository.  

### List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?  
Os metodos invocados como o save(), findById(), delete() e findAll() são métodos predifinidos pelo CrudRepository que é extendido no UserRepository.  

### Where is the databeing saved?  
A h2database é uma base de dados em memória, logo os dados são armazenados enquanto corremos o programa. Se terminarmos e voltamos a correr os dados não ficam gravados, fazendo desta implementação não persistente.  

### Where is the rule for the “not empty” email address defined?  
É definida no model User.java pela anotação @NotBlank.  
@NotBlank(message = "Email is mandatory")  
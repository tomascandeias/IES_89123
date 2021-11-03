## Apache Tomcat  
O Tomcat é um servidor web Java, mais especificamente, um container de servlets.  

Inside tomcat folder  
Start: $ ./bin/startup.sh  
Shutdown: $ ./bin/shutdown.sh  

Tomcat Server Error - Port 8080 already in use  
$ netstat -lnp | grep 8080  
$ kill -9 process_id  

Dentre os componentes do TomCat, o Catalina é o contêiner Servlet que implementa a especificação para Servlets e JavaServer Pages. Já o Coyote trata de toda a comunicação HTTPe encaminha as solicitações para o TomCat Engine (Catalina).  

# Spring Boot H2 Database CRUD.

Desarrollo de una aplicación que exponga una API RESTful para la creación de usuarios y manejo de JWT como token.

REQUISITO:

● Base de datos en memoria. H2.

● Proceso de build vía Maven.

● Persistencia con JPA.

● Framework SpringBoot.

● Java 17.

Estructura del Proyecto:

![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/structure.jpg)

ENDPOINT

CREAR USUARIO
 http://localhost:8080/api/users

 
![image](https://github.com/fhernandez204/apiRest/blob/master/createUser.png)

SI EL CORREO YA EXISTE

![image](https://github.com/fhernandez204/apiRest/blob/master/createUser2.png)

SI EL CORREO NO TIENE EL FORMATO CORRECTO

![image](https://github.com/fhernandez204/apiRest/blob/main/createUser3.png)


GET USUARIO POR ID

  http://localhost:8080/api/users/19152

 ![image](https://github.com/fhernandez204/apiRest/blob/master/getUsers.png)


 MODIFICAR USUARIO

 http://localhost:8080/api/users/6352

 ![image](https://github.com/fhernandez204/apiRest/blob/master/putUser.png)

 TestUnit
 ![image](https://github.com/fhernandez204/apiRest/blob/master/testUnit.png)

 Swagger

 http://localhost:8080/swagger-ui/index.html

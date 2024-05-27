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

ENDPOINT:

CREAR NAVE
 http://localhost:8080/api/naves

![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/create.jpg)


TODAS LAS NAVES
http://localhost:8080/api/naves

![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/all.jpg)


OBTENER NAVE POR ID
http://localhost:8080/api/naves/152

 ![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/byID.jpg)


OBTENER NAVES POR NOMBRE
http://localhost:8080/api/naves?title=NAVE

![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/byName.jpg)


 MODIFICAR NAVE

 http://localhost:8080/api/naves/152

 ![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/put.jpg)

DESPUES DE MODIFICAR
  ![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/byIDForUpdate.jpg)


ELIMINAR NAVE
http://localhost:8080/api/naves/152

 ![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/byIDForDelete.jpg)

 TestUnit
 ![image](https://github.com/fhernandez204/spring-boot-h2-database-crud/blob/master/images/junit.jpg)

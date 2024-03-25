# GraphQL CRUD Operations with Spring Boot

This project highlights how to perform CRUD operations with **GraphQL** and Spring Boot.

### What is GraphQL?

GraphQL is a query language for APIs (Application Programming Interfaces) and a runtime environment for executing those queries by using a type system defined by the server.

Unlike traditional RESTful APIs where clients have to make multiple requests to different endpoints to fetch various pieces of data, GraphQL allows clients to request only the data they need in a single query. This ability to specify exactly what data is needed makes GraphQL more efficient in terms of data retrieval and can lead to improved performance in applications.

While GraphQL is primarily renowned for its proficiency in retrieving data through queries, it also facilitates the creation, updating, and deletion of data via mutations.

* Official Documentation: https://graphql.org/
* GraphQL Custom Scalar: https://github.com/ruviniramawickrama/demo-graphql-custom-scalar-with-spring-boot/
* GraphQL Custom Directive: https://github.com/ruviniramawickrama/demo-graphql-custom-directive-with-spring-boot/

### Prerequisites
Before running the application, make sure the following list is installed/configured on your machine:

* Java version 17 or above
* Maven
* PostgreSQL
* pgAdmin (Optional)

### Running the Application

1. Clone the project using the command `git clone https://github.com/ruviniramawickrama/demo-graphql-with-spring-boot.git`
2. Go to the cloned project's root directory and open a command prompt
3. Build the project using the command `mvn clean install`
4. Run the project using the command `mvn spring-boot:run`
5. Open the GraphQL playground url http://localhost:8080/graphiql
6. Use the sample GraphQL Queries and Mutations given in the file `queries-and-mutations` to test the endpoints (`\src\main\resources\graphql\queries-and-mutations`)

### Application Details

`pom.xml`
- Contains the dependencies related to GraphQL, Postgres (database connection) and Spring Data JPA.

`application.yml`
- Contains the properties related to GraphQL, JPA and Postgres.

`schema.sql`
- Contains create table SQL statement to create the `Book` table.
- When the application starts, Spring Boot automatically runs the contents of this file based on the **sql** and **jpa** properties mentioned in the `application.yml` file.

`schema.graphqls`
- GraphQL schema definition which contains Queries to retrieve data and Mutations to manipulate data.
- Serves as a contract between the client and the server, specifying what operations are supported and what data can be accessed.
- Defines the types of data that can be queried and manipulated, as well as the relationships between these types.

`BookController.java`
- Controller class which contains the mappings for Queries and Mutations defined in `schema.graphqls`.

`BookService.java`
- Implemented by `BookServiceImpl.java` which is responsible for communicating with the repository class to perform CRUD operations on the Book entity.

`BookRepository.java`
- Implements Spring Data JpaRepository which provides ready-made methods to communicate with the database. It uses `Book.java` as the entity which maps with the respective database table.

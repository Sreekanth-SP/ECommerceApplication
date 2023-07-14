# ECommerceApplication
> `This is a sample E-commerce project through Springboot and stores the data in the Mysql database. This repository contains an ECommerce project implemented using the MVC (Model-View-Controller) architecture.`
---
The project is built with Java and utilizes the following dependencies:

* **Spring Web** - Framework for building web applications.
* **Spring Data JPA** - Framework for accessing and managing relational databases.
* **MySQL Driver** - JDBC driver for connecting to MySQL database.
* **Lombok** - Library for reducing boilerplate code in Java classes.
* **Swagger** - Tool for documenting and testing APIs.
---
## Project Structure
The project follows the MVC architecture, which separates the application into three main components:

* **Models:** These are the entity models used in the project, representing different aspects of the ECommerce system.
  * <ins>Models:</ins>
      * User - It has id as the primary key and it autogenerates, name, email, password and phone number.
      * Address -It has id as the primary key and it autogenerates, name, landmark, zip code and state.
      * Product -It has id as the primary key and it autogenerates, name, description, category and brand.
      * Order - It has an id and it joins the tables, User, product and address as @ManyToOne, product quality. 
* **Controllers:** Controllers handle incoming requests, process the data, and return appropriate responses. They act as intermediaries between the models and views.
    * <ins>Controllers:</ins>
      * UserController
      * AddressController
      * ProductController
      * OrderController
* **Service:** In Service, we can implement the business logic.
    * <ins>Services:</ins>
      * UserService
      * AddressService
      * ProductService
      * OrderService
* **Repository:** The repositories are extending the JPA repository where the CRUD operations work. The repositories are interfaces.
    * <ins>Repositories:</ins>
      * IUserRepo
      * IAddressRepo
      * IProductRepo
      * IOrderRepo
(View: This project mainly concentrated on the backend part)

---
## Endpoints
The project exposes the following endpoints to interact with the ECommerce system:

1. Create users: POST /users
2. Create products: POST /products
3. Create Address: POST /addresses
4. Place an order (Create Order): POST /orders
    * Request body:
        * userId: Integer (foreign key/mappings)
        * productId: Integer (foreign key/mappings)
        * addressId: Integer (foreign key/mappings)
5. Get order by order id: GET /orders/{orderId}
6. Get user by userId: GET /users/{userId}
7. Get all products: GET /products
8. Get all products by category: GET /products/category/{category}
9. Delete product by productId: DELETE /products/{productId}
  > We can also add endpoints to our queries.  
---
## Documentation
The API documentation for the ECommerce project is available through Swagger. Once the application is running, you can access the Swagger UI by visiting the following URL:
> `http://localhost:8080/swagger-ui.html`

The Swagger UI provides detailed information about each endpoint, including request/response structures and example payloads. 

---
## Conclusion  
This ECommerce project follows the MVC architecture and provides endpoints for creating users, products, addresses, and placing orders. It also includes endpoints for retrieving specific orders, users, and products, as well as deleting products by ID. The project is implemented using Java and relies on various dependencies such as Spring Web, Spring Data JPA, MySQL Driver, Lombok, and Swagger

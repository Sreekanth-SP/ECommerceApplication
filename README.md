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
* **Controllers:** Controllers handle incoming requests, process the data, and return appropriate responses. They act as intermediaries between the models and views.
* **Service:** In Service, we can implement the business logic.
(View: This project mainly concentrated on the backend part)
---
## Documentation
The API documentation for the ECommerce project is available through Swagger. Once the application is running, you can access the Swagger UI by visiting the following URL:
> `http://localhost:8080/swagger-ui.html`

The Swagger UI provides detailed information about each endpoint, including request/response structures and example payloads. 

---
## Conclusion  
This ECommerce project follows the MVC architecture and provides endpoints for creating users, products, addresses, and placing orders. It also includes endpoints for retrieving specific orders, users, and products, as well as deleting products by ID. The project is implemented using Java and relies on various dependencies such as Spring Web, Spring Data JPA, MySQL Driver, Lombok, and Swagger

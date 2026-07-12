<div align="center">

# ProductAPI

A RESTful Product Management API built with **Spring Boot** and **MongoDB**.

<p>

<img src="https://img.shields.io/badge/Java-574E6D?style=for-the-badge&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Boot-214252?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/MongoDB-4B586E?style=for-the-badge&logo=mongodb&logoColor=white">
<img src="https://img.shields.io/badge/Maven-4D424D?style=for-the-badge&logo=apachemaven&logoColor=white">

</p>

</div>

---

## Overview

**ProductAPI** is a backend REST API that demonstrates how to build a layered Spring Boot application using MongoDB for CRUD operations. The project follows a clean architecture by separating responsibilities into Controller, Service, Repository, and Entity layers.

It was built as a learning project to understand modern Java backend development with Spring Boot.

---

## Features

- Create a new product
- Retrieve all products
- Retrieve a product by ID
- Update an existing product
- Delete a product
- MongoDB Atlas integration
- Layered Spring Boot architecture

---

## Tech Stack

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB Atlas
- Maven
- Postman / Insomnia

---

## API Endpoints

| Method | Endpoint         | Description                |
| ------ | ---------------- | -------------------------- |
| GET    | `/products`      | Retrieve all products      |
| GET    | `/products/{id}` | Retrieve a product by ID   |
| POST   | `/products`      | Create a new product       |
| PUT    | `/products/{id}` | Update an existing product |
| DELETE | `/products/{id}` | Delete a product           |

---

## Example Product JSON

```json
{
  "name": "Gaming Laptop",
  "price": 70000
  "quantity": 25
}
```

---

## Getting Started

### Clone the repository

```bash
git clone https://github.com/SiddhiikaN/ProductAPI-SpringBoot.git
```

### Navigate to the project

```bash
cd ProductAPI-SpringBoot
```

### Configure MongoDB

Update the MongoDB connection string in `application.properties` with your own credentials.

```properties
spring.mongodb.uri = <YOUR_MONGODB_CONNECTION_STRING>
```

### Run the application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```
---
## Future Improvements

- Input validation
- Global exception handling
- Unit testing with JUnit
- Docker support

## Learning Outcomes

Through this project I learned:

* Spring Boot project structure
* Layered architecture
* Dependency Injection
* Building RESTful APIs
* CRUD operations
* Spring Data MongoDB
* JSON request and response handling
* Maven project management


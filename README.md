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

**ProductAPI** is a RESTful backend API built with Spring Boot and MongoDB. It demonstrates a layered architecture by separating responsibilities into the Controller, Service, Repository, and Entity layers.

---

## Features

* RESTful CRUD API for product management
* MongoDB Atlas integration using Spring Data MongoDB
* Input validation with Jakarta Validation
* Global exception handling with custom exceptions
* Appropriate HTTP status codes for API responses

---
## Tech Stack

- Java 21
- Spring Boot
- Spring Data MongoDB
- MongoDB Atlas
- Maven
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

## Product JSON

```json
{
  "name": "Gaming Laptop",
  "price": 70000
}
```
---

## Postman Collection

A ready-to-use Postman collection and environment are included for testing the API.

```text
postman/
├── ProductAPI.postman_collection.json
└── ProductAPI.postman_environment.json
```

After importing:

1. Select the **ProductAPI Local** environment.
2. Ensure `baseUrl` is set to `http://localhost:8080`.
3. Set the `productId` variable to an existing product ID when testing endpoints that require one.

---

## Validation

Incoming requests are validated before processing.

* `name` must not be blank
* `price` must be greater than `0`

---

## Exception Handling

The API uses centralized exception handling to return meaningful error responses.

Example:

```json
{
  "message": "Product not found."
}
```
---
## Prerequisites

Make sure you have the following installed/set up before running the project:

* Java 21
* Maven (or use the included `./mvnw` wrapper)
* A MongoDB Atlas account with a cluster and connection string

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

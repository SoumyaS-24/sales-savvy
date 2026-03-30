# 🛒 Sales-Savvy Backend

## 📌 Project Overview

* Backend service for an e-commerce platform
* Built using Spring Boot
* Provides RESTful APIs
* Uses JWT authentication
* Supports role-based access control (Admin / Customer)
* Uses MySQL database

---

## 🚀 Features

* User registration
* User login
* JWT token authentication
* Role-based authorization
* Product management
* Cart management
* Order management
* Payment processing
* Admin management features
* Secure API endpoints

---

## 🏗 Tech Stack

* Java
* Spring Boot
* Spring Web MVC
* Spring Security
* JWT
* MySQL
* Maven
* Postman

---

## 🔐 Authentication

* JWT-based authentication
* Credentials stored in MySQL
* Token generated after login
* Token required for secured APIs

### Authentication Flow

* Register user
* Login user
* Generate JWT token
* Send token in request header
* Validate token in backend

---

## 📦 Core Modules

### User Management

* Register user
* Login user
* Generate JWT token
* Assign user roles

### Product Management

* Add product
* Update product
* Delete product
* View products

### Cart Management

* Add product to cart
* Remove product from cart
* View cart

### Order Service

* Place order
* View order history
* Manage order status

### Payment Service

* Process payment
* Handle payment confirmation

### Admin Features

* Manage products
* Manage orders
* Monitor platform activity

---

## 🗄 Database

* MySQL database
* Tables include:

  * Users
  * Products
  * Cart
  * Orders
  * Payments
  * CartItem
  * OrderItem
  * Category

### Example Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/salesavvydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## ⚙️ Project Setup

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate to Project

```bash
cd sales-savvy
```

### Install Dependencies

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

### Server URL

* [http://localhost:5050](http://localhost:5050)

---

## 🧪 API Testing

* Tool: Postman
* Steps:

  * Register user
  * Login user
  * Receive JWT token
  * Add token in header
  * Access secured APIs

### Example Header

```
Cookie: authToken <JWT_TOKEN>
```

---

## 📂 Project Structure

```
sales-savvy
│
├── controllers
├── services
├── repositories
├── entities
├── filters
├── config
└── application.properties
```

---

## 👨‍💻 Author

* Soumya S Gadad
* Skills:
  * Spring Boot
  * REST APIs
  * JWT Authentication
  * MySQL

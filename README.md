# Car Rental System

<h2>Overview</h2>

The Car Rental System is a microservices-based project designed to manage car rentals efficiently. The system includes the following services:

Order Service: Manages customer rental orders.

Product Service: Handles car inventory and availability.

Billing Service: Processes payments and billing details.

Each service communicates using REST APIs and is registered with a Eureka Server for service discovery. The project utilizes a MySQL database for data persistence, accessed via phpMyAdmin.

Features

Order Management: Create, view, and manage rental orders.

Car Inventory Management: Add, update, and retrieve car details.

Billing System: Calculate and process payments.

Service Discovery: Eureka-based dynamic service registration.

Database Integration: Persistent storage using MySQL.

Architecture

The system is built using the microservices architecture:

Backend: Spring Boot

Database: MySQL (phpMyAdmin for management)

Service Discovery: Eureka Server

Prerequisites

Java: JDK 17 or higher

Maven: Latest version

MySQL: Installed and running

phpMyAdmin: Installed and configured

Eureka Server: Running and accessible

Getting Started

Clone the Repository

git clone https://github.com/your-username/car-rental-system.git
cd car-rental-system

Setting Up Databases

Open phpMyAdmin.

Create databases for each service:

order_service_db

product_service_db

billing_service_db

Import the respective SQL schema for each service from the /sql directory.

Configure Application Properties

Update the database connection details in each service's src/main/resources/application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/{db_name}
spring.datasource.username={your_mysql_username}
spring.datasource.password={your_mysql_password}

Replace {db_name}, {your_mysql_username}, and {your_mysql_password} with your details.

Build the Services

Navigate to each service directory and run:

mvn clean install

Start Services

Start the Eureka Server.

Run the microservices in the following order:

Order Service

Product Service

Billing Service

Use the following command to start each service:

mvn spring-boot:run

API Endpoints

Order Service

Create Order: POST /api/orders

View Order: GET /api/orders/{id}

Product Service

Add Car: POST /api/cars

Get Car Details: GET /api/cars/{id}

Billing Service

Generate Bill: POST /api/billing

Get Bill: GET /api/billing/{id}

Running the Application

Access the Eureka Server Dashboard at:

http://localhost:8761

Test API endpoints using tools like Postman or cURL.

Directory Structure

car-rental-system/
|-- order-service/
|   |-- src/
|-- product-service/
|   |-- src/
|-- billing-service/
|   |-- src/
|-- eureka-server/
|   |-- src/
|-- sql/
|   |-- order_service_db.sql
|   |-- product_service_db.sql
|   |-- billing_service_db.sql

Future Enhancements

User Authentication: Integrate OAuth for secure access.

Analytics Dashboard: Add reporting features for admins.

Notification Service: Implement email/SMS notifications.

Contributing

Fork the repository.

Create a feature branch.

Commit your changes.

Submit a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.


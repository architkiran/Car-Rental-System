# Car Rental System

<h4>Video link: https://github.com/architkiran/Car-Rental-System/blob/main/CAR-RENTAL-SYSTEM%20(1).mp4</h4>

## Overview
The Car Rental System is a microservices-based project designed to manage car rentals efficiently. The system includes the following services:

1. **Order Service**: Manages customer rental orders.
2. **Product Service**: Handles car inventory and availability.
3. **Billing Service**: Processes payments and billing details.

Each service communicates using REST APIs and is registered with a Eureka Server for service discovery. The project utilizes a MySQL database for data persistence, accessed via phpMyAdmin.

---

## Features
- **Order Management**: Create, view, and manage rental orders.
- **Car Inventory Management**: Add, update, and retrieve car details.
- **Billing System**: Calculate and process payments.
- **Service Discovery**: Eureka-based dynamic service registration.
- **Database Integration**: Persistent storage using MySQL.

---

## Architecture

The system is built using the microservices architecture:

- **Backend**: Spring Boot
- **Database**: MySQL (phpMyAdmin for management)
- **Service Discovery**: Eureka Server

---

## Prerequisites

1. **Java**: JDK 17 or higher
2. **Maven**: Latest version
3. **MySQL**: Installed and running
4. **phpMyAdmin**: Installed and configured
5. **Eureka Server**: Running and accessible

---

## Getting Started

```bash
### Clone the Repository

git clone https://github.com/architkiran/car-rental-system.git
cd car-rental-system

### Setting Up Databases
Open phpMyAdmin.
Create databases for each service:
- order_service_db
- product_service_db
- billing_service_db
Import the respective SQL schema for each service from the /sql directory.

### Build the Services
Navigate to each service directory and run:
- mvn clean install

### Start Services
Start the Eureka Server.
Run the microservices in the following order:
- Order Service
- Product Service
- Billing Service
Use the following command to start each service:
-mvn spring-boot:run
```

### API Endpoints

**Order Service**
```
- Create Order: POST /api/orders
- View Order: GET /api/orders/{id}
```

**Product Service**
```
- Add Car: POST /api/cars
- Get Car Details: GET /api/cars/{id}
```

**Billing Service**
```
- Generate Bill: POST /api/billing
- Get Bill: GET /api/billing/{id}
```

### Running the Application
**Access the Eureka Server Dashboard at:**
```
http://localhost:8761
```
### Project Directory Structure:
```
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
```

### Key Features and Concepts

- **Microservices Architecture**: The Car Rental System is built using microservices, where each service is independent and communicates over REST APIs. The system includes:
  - **Order Service**: Handles customer rental orders, including creation, retrieval, and management.
  - **Product Service**: Manages the car inventory, adding, updating, and retrieving car details.
  - **Billing Service**: Manages the payment processing and generates bills for rental orders.

- **Eureka Server for Service Discovery**: The system uses **Eureka** for dynamic service discovery, allowing services to register and discover each other easily.

- **MySQL Database**: The system relies on **MySQL** databases for persistent storage of order, product, and billing information. phpMyAdmin is used to manage the databases.

- **Spring Boot**: All services are developed using **Spring Boot**, a framework that simplifies the development and deployment of Java-based microservices.

- **RESTful API**: The services expose RESTful APIs, which allows communication between the microservices and enables interaction with external systems such as client applications.

- **Service Interdependence**: While each service functions independently, they work together to manage the full car rental lifecycle—from car availability, to booking, to billing.

---

### Conclusion

The **Car Rental System** provides an efficient and scalable solution for managing car rental operations. By leveraging a microservices architecture, each component of the system—orders, products, and billing—is isolated, making it easier to develop, maintain, and scale individual services as needed. The use of **Eureka Server** for service discovery and **MySQL** for persistent storage ensures that the system is both flexible and robust. As the system evolves, there is potential to integrate additional services such as payment gateways, user authentication, and analytics, further enhancing its functionality and user experience. This project serves as a solid foundation for building more complex, distributed applications in the car rental domain.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


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

### Clone the Repository
```bash
git clone https://github.com/your-username/car-rental-system.git
cd car-rental-system

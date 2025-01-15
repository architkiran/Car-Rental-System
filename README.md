# Car-Rental-System

<h2>Overview</h2>

The Car Rental System is a microservices-based application designed to manage car rentals and availability efficiently. It ensures that car availability is verified before processing a rental request. The system uses Spring Boot for building services, Eureka for service discovery, and OpenFeign for inter-service communication.

<h2>Key Features:</h2>
Car Management: Add, view, and check the availability of cars in the fleet.
Rental Management: Process rental requests only if the requested car is available.
Service Registry: Dynamically discover and connect services.


Eureka Server: Acts as a service registry to discover and manage microservices.
Product Service: Manages product information and inventory.
Order Service: Handles order placement and validates product availability using the Product Service.
Communication: Services communicate via OpenFeign.


<h1>Tools used:</h1>
-Spring Boot 
-Spring Cloud Eureka
-MySQL (phpmyadmin)
-Postman 
-Intelij
-Eureka to communicate between services

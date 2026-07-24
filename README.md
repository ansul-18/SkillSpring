# Payment Service – Razorpay Integration

This project is a backend application built using **Java** and **Spring Boot** that demonstrates how an online payment system works using the **Razorpay Payment Gateway**.

The main objective of this project was to understand how payment gateways are integrated into real-world applications. It covers the complete payment flow, from creating an order to verifying the payment on the server after a successful transaction.

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Razorpay API
* Maven
* Postman
* Git & GitHub

## Features

* View available courses.
* Create payment orders using Razorpay.
* Verify payments securely after successful transactions.
* REST APIs for payment operations.
* Layered architecture (Controller, Service, Repository).
* Exception handling and request validation.

## Project Structure

```text
src/main/java/com/cfs/PaymentService
│
├── controller
├── service
├── repository
├── model
├── dto
├── config
└── exception
```

## API Endpoints

| Method | Endpoint               | Description                   |
| ------ | ---------------------- | ----------------------------- |
| GET    | `/api/courses`         | Get all available courses     |
| GET    | `/api/config`          | Get Razorpay public key       |
| POST   | `/api/payments/orders` | Create a payment order        |
| POST   | `/api/payments/verify` | Verify payment after checkout |

## What I Learned

While building this project, I learned:

* How Razorpay payment integration works.
* Creating and managing payment orders.
* Verifying payment signatures securely on the backend.
* Building REST APIs using Spring Boot.
* Organizing code using a layered architecture.
* Handling exceptions and validating requests.

## Future Improvements

* User authentication with Spring Security and JWT.
* Store payment history.
* Email confirmation after successful payment.
* Docker support.
* Event-driven notifications using Kafka.

## Author

**Ansul Verma**

Computer Science Student | Java Backend Developer (Learning)

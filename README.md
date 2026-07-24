# 💳 Payment Service – Razorpay Integration

A Spring Boot backend application that demonstrates secure payment processing using the **Razorpay Payment Gateway**. The project provides REST APIs to manage course purchases, create payment orders, and verify successful transactions.

This project was built to understand real-world payment gateway integration, secure payment verification, and backend API development using Spring Boot.

---

## 🚀 Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Payment Gateway:** Razorpay
* **Database:** MySQL
* **ORM:** Spring Data JPA / Hibernate
* **Build Tool:** Maven
* **API Testing:** Postman
* **Version Control:** Git & GitHub

---

## ✨ Features

### 📚 Course Management

* Fetch available courses.
* Display course details before purchase.

### 💳 Payment Processing

* Create Razorpay orders.
* Secure order generation.
* Handle payment requests through Razorpay Checkout.

### ✅ Payment Verification

* Verify payment signature after successful payment.
* Prevent payment tampering.
* Return payment confirmation to the client.

### 📩 Notification Support

* Trigger notification after successful payment.
* Designed to integrate with Email, SMS, or Kafka-based notification services.

---

## 🏗 Architecture

```text
Client (Frontend)
        │
        ▼
Spring Boot REST API
        │
        ▼
Business Service Layer
        │
        ▼
Razorpay API
        │
        ▼
Payment Verification
```

The application follows a layered architecture to keep business logic separate from API and data access layers.

---

## 📂 Project Structure

```text
src/main/java/com/cfs/PaymentService
│
├── controller
├── service
├── dto
├── model
├── repository
├── config
└── exception
```

---

## 📡 REST API Endpoints

| Method | Endpoint               | Description                  |
| ------ | ---------------------- | ---------------------------- |
| GET    | `/api/courses`         | Get all available courses    |
| GET    | `/api/config`          | Retrieve Razorpay public key |
| POST   | `/api/payments/orders` | Create a Razorpay order      |
| POST   | `/api/payments/verify` | Verify payment signature     |

---

## 📖 API Flow

1. Fetch available courses.
2. Select a course.
3. Create a Razorpay order.
4. Complete payment using Razorpay Checkout.
5. Verify the payment signature.
6. Send success response and trigger notification.

---

## 🔐 Security

* Razorpay Signature Verification
* Server-side Payment Validation
* Exception Handling
* Input Validation
* Secure API Design

---

## 📚 Concepts Implemented

* Spring Boot REST APIs
* Razorpay Payment Gateway Integration
* Payment Order Creation
* Payment Signature Verification
* DTO Pattern
* Exception Handling
* Layered Architecture
* Dependency Injection
* External API Integration

---

## 🔮 Future Enhancements

* JWT Authentication & Spring Security
* User Order History
* Payment Status Dashboard
* Email Invoice Generation
* Kafka Event-Based Notifications
* Docker Deployment
* CI/CD Pipeline

---

## ▶️ Getting Started

### Prerequisites

* Java 21+
* Maven
* MySQL
* Razorpay Account

### Clone Repository

```bash
git clone https://github.com/your-username/payment-service.git
```

### Configure Environment

Add your Razorpay credentials in `application.properties`:

```properties
app.razorpay.api.key-id=YOUR_KEY_ID
app.razorpay.api.key-secret=YOUR_KEY_SECRET
```

### Run the Application

```bash
mvn spring-boot:run
```

---

## 👨‍💻 Author

**Ansul Verma**

Java Backend Developer | Spring Boot | REST APIs | Payment Gateway Integration

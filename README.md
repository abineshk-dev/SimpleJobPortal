# 🛠️ Microservices Job Portal (Basic Version)

A beginner-friendly **Microservices Architecture** project using **Spring Boot**, **Spring Cloud**, and **Eureka**, demonstrating modular services, centralized routing, and communication between services.

---

## 🚀 Architecture Overview

This project simulates a simplified **Job Portal** backend, built with microservices principles.

### 🧩 Microservices Included

| Service             | Port | Description                                       |
|---------------------|------|---------------------------------------------------|
| **Eureka Server**   | 8761 | Service registry for dynamic service discovery    |
| **API Gateway**     | 8080 | Routes incoming requests to appropriate services  |
| **Project Service** | 8081 | Manages project/job-related operations            |
| **Employee Service**| 8082 | Manages employee details and interactions         |

---

## 💡 Features Implemented

- ✅ **Spring Boot-based Microservices**
- ✅ **Eureka Server for service discovery**
- ✅ **Spring Cloud Gateway for routing**
- ✅ **Decoupled Project & Employee services**
- ❌ **No authentication (JWT not yet integrated)**

---

## 🧠 Tech Stack

| Tech               | Purpose                            |
|--------------------|-------------------------------------|
| Java 17            | Programming language                |
| Spring Boot        | Microservice framework              |
| Spring Cloud       | Eureka, Gateway                     |
| REST APIs          | Communication layer                 |
| MySQL (optional)   | Persistent storage (if configured)  |
| Postman            | API testing                         |
| IntelliJ IDEA      | IDE used for development            |

---

## 📁 Project Structure

```plaintext
microJobPortal/
├── api-gateway/          # Routes all requests
├── eureka-server/        # Service discovery
├── project-service/      # Manages project CRUD
├── employee-service/     # Manages employee data
└── README.md

🚀 How to Run the Project
1.Start Eureka Server

cd eureka-server
./mvnw spring-boot:run

2.Start Project Service

cd project-service
./mvnw spring-boot:run

3.Start Employee Service

cd employee-service
./mvnw spring-boot:run

4.Start API Gateway

cd api-gateway
./mvnw spring-boot:run
5.Visit Eureka Dashboard

URL: http://localhost:8761

6.Test API Endpoints via Gateway

Project API: http://localhost:8080/project-service/api/projects

Employee API: http://localhost:8080/employee-service/api/employees

🔮 Future Enhancements
🔐 Add Auth-Service with JWT for secure access

📦 Use Feign Client for inter-service communication

📊 Add project dashboards and analytics

🖥️ Create a frontend using React or Angular

💬 Integrate email/SMS notifications

👨‍💻 Author
Abinesh K
Java Backend Developer | Spring Boot | Microservices Enthusiast
🔗 GitHub

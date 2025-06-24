# 🛠️ Microservices Job Portal (Basic Version)

A beginner-friendly **Microservices Architecture** project using **Spring Boot**, **Spring Cloud**, and **Eureka**, demonstrating modular services, centralized routing, and communication between services.

---

## 🚀 Architecture Overview

This project simulates a simplified **Job Portal** backend, built with microservices principles.

### 🧩 Microservices Included

| Service              | Port | Description                                       |
|----------------------|------|---------------------------------------------------|
| **Eureka Server**    | 8761 | Service registry for dynamic service discovery    |
| **API Gateway**      | 8080 | Routes incoming requests to appropriate services  |
| **Project Service**  | 8081 | Manages project/job-related operations            |
| **Employee Service** | 8082 | Manages employee details and interactions         |

---

## 💡 Features Implemented

- ✅ **Spring Boot-based Microservices**
- ✅ **Eureka Server for service discovery**
- ✅ **Spring Cloud Gateway for routing**
- ✅ **Decoupled Project & Employee services**
- ❌ **No authentication (JWT not yet integrated)**

---

## 🧠 Tech Stack

| Tech             | Purpose                              |
|------------------|---------------------------------------|
| **Java 17**      | Programming language                  |
| **Spring Boot**  | Microservice framework                |
| **Spring Cloud** | Eureka, Gateway                       |
| **REST APIs**    | Communication layer                   |
| **MySQL**        | Persistent storage (if configured)    |
| **Postman**      | API testing                           |
| **IntelliJ IDEA**| IDE used for development              |

---

## 📁 Project Structure

```plaintext
microJobPortal/
├── api-gateway/          # Routes all requests
├── eureka-server/        # Service discovery
├── project-service/      # Manages project CRUD
├── employee-service/     # Manages employee data
└── README.md
```



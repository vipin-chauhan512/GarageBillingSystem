# 🔧 Garage Billing System

A Java-based Garage Billing System developed using **Core Java, JDBC, and MySQL**. This application helps manage customer details, vehicle information, garage services, and invoices through database operations.

## 📌 Project Overview

The Garage Billing System is designed to simplify basic garage management tasks. It uses Java for application logic, JDBC to connect Java with the database, and MySQL to store and manage records.

## ✨ Features

- 👤 **Customer Management** — Manage customer information.
- 🚗 **Vehicle Management** — Maintain vehicle records.
- 🛠️ **Service Management** — Handle garage service information.
- 🧾 **Invoice Management** — Create and retrieve billing invoices.
- 🗄️ **Database Connectivity** — Connect Java with MySQL using JDBC.
- 📋 **CRUD Operations** — Perform database operations for supported records.

## 🛠️ Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

## 📂 Project Structure

```text
GarageBillingSystem/
├── src/
│   ├── App.java
│   ├── entity/
│   │   ├── Customer.java
│   │   ├── Vehicle.java
│   │   └── Invoice.java
│   ├── service/
│   │   ├── CustomerService.java
│   │   ├── VehicleService.java
│   │   └── InvoiceService.java
│   └── DbConfig.java
├── README.md
└── .gitignore
```

## ⚙️ Prerequisites

Before running the project, make sure you have:

- Java JDK installed
- MySQL Server installed and running
- MySQL Connector/J JDBC driver
- IntelliJ IDEA or another Java IDE

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/GarageBillingSystem.git
```

Replace `YOUR_USERNAME` with your GitHub username.

### 2. Open the project

Open the cloned project in IntelliJ IDEA.

### 3. Create the MySQL database

Open MySQL Workbench or the MySQL command line and create a database:

```sql
CREATE DATABASE garage_billing;
USE garage_billing;
```

Create the required tables according to the fields used by your Java entity classes and SQL queries.

### 4. Configure the database connection

Update `DbConfig.java` with your MySQL connection details.

Example:

```java
String url = "jdbc:mysql://localhost:3306/garage_billing";
String username = "root";
String password = "YOUR_MYSQL_PASSWORD";
```

Use your actual MySQL username and password. Do not upload real passwords to GitHub.

### 5. Configure JDBC

Make sure the MySQL Connector/J driver is added to your project's dependencies or classpath.

### 6. Run the application

Run `App.java` from IntelliJ IDEA and follow the application's console prompts.

## 🎯 Learning Objectives

This project demonstrates practical understanding of:

- Object-Oriented Programming (OOP) in Java
- Classes, objects, and encapsulation
- JDBC database connectivity
- SQL queries and database operations
- Separation of entity and service classes
- Basic Git and GitHub workflow

## 🔮 Future Improvements

- Add user authentication and role-based access
- Generate printable invoices
- Add service and payment history
- Validate customer and vehicle inputs
- Build a graphical interface using Java Swing or JavaFX
- Add a Spring Boot REST API and web frontend

## 👨‍💻 Author

**Vipin Chauhan**

Java Developer | Core Java | JDBC | MySQL

---

⭐ If you find this project useful, consider giving the repository a star!

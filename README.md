
---

# LagnaJulwa – Marriage Bureau Management System

## 📌 Project Overview

**LagnaJulwa** is a Java-based Marriage Bureau system that manages bride and groom profiles using **CRUD operations**. It uses **SQL** as the backend and **Java** for frontend and business logic. The system simplifies matchmaking, reduces manual work, and keeps records organized.

---

## 📂 Project Structure

```
LagnaJulwa/
├── src/
│   └── com/
│       └── lagna/
│           └── julwa/
│               ├── db/
│               │   └── DBConnection.java
│               ├── model/
│               │   └── User.java
│               ├── dao/
│               │   └── UserDAO.java
│               ├── service/
│               │   └── UserService.java
│               ├── ui/
│               │   └── MainMenu.java
│               └── Main.java
├── sql/
│   └── marriage_bureau.sql
└── README.md
```

> **Note:** Add `.gitkeep` files in empty folders so Git preserves them.

---

## 📄 File Details

### 1️⃣ `User.java`

* Model (Entity) class
* Represents a bride/groom profile
* Contains variables like name, age, gender, profession, contact
* Includes getters and setters

### 2️⃣ `UserDAO.java`

* Data Access Object (DAO)
* Handles all database operations
* Performs **Create, Read, Update, Delete (CRUD)**
* Uses JDBC to interact with SQL

### 3️⃣ `UserService.java`

* Service layer
* Contains business logic
* Acts as a bridge between UI and DAO
* Calls DAO methods to process data

### 4️⃣ `MainMenu.java`

* User Interface (Frontend)
* Displays menu options
* Takes user input
* Calls service methods based on choice

### 5️⃣ `DBConnection.java`

* Manages database connection
* Provides reusable JDBC connection

### 6️⃣ `Main.java`

* Entry point of the application
* Starts the program and loads the main menu

---

## 🔁 Application Flow

```
User → MainMenu → UserService → UserDAO → SQL Database
```

---

## 🛠 Technologies Used

* Java
* JDBC
* MySQL (SQL)

---


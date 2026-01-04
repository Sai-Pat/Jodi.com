
---

# 💍 Jodi.com – Marriage Bureau Management System

*(Backend | Console-Based | JDBC & MySQL)*

Jodi.com is a **console-based Marriage Bureau Management System** developed using **Core Java and JDBC**.
The project focuses on **backend development**, demonstrating clean architecture, database connectivity, and real-world business logic without any graphical UI.

---

## 📁 Project Structure

```text
jodidotcom/
├── src/
│   └── com/
│       ├── application/
│       │   └── MainApp.java
│       ├── controller/
│       │   └── UserController.java
│       ├── model/
│       │   └── User.java
│       ├── dao/
│       │   ├── UserDAO.java
│       │   └── UserDAOImpl.java
│       ├── service/
│       │   ├── UserService.java
│       │   └── UserServiceImpl.java
│       ├── util/
│       │   └── DBConnection.java
│       └── validation/
│           └── UserValidator.java
├── lib/
│   └── mysql-connector-j-8.0.33.jar
├── sql/
│   └── jodidotcom.sql
└── README.md
```

---

## 📄 File Details

### 1️⃣ `User.java`

* Model (Entity) class
* Represents a bride/groom profile
* Contains fields such as name, age, gender, email, city, profession, and preferences
* Uses encapsulation with getters and setters

---

### 2️⃣ `UserDAO.java`

* Data Access Object (DAO) interface
* Declares database operations related to users
* Defines methods for registration, login, and matchmaking
* Ensures separation of database logic

---

### 3️⃣ `UserDAOImpl.java`

* Implementation of `UserDAO`
* Contains actual JDBC code
* Performs **Create, Read, Update, Delete (CRUD)** operations
* Uses `PreparedStatement` and `ResultSet`
* Handles SQL and database exceptions

---

### 4️⃣ `UserService.java`

* Service layer interface
* Defines business logic operations
* Acts as a bridge between Controller and DAO

---

### 5️⃣ `UserServiceImpl.java`

* Implements `UserService`
* Calls DAO methods to process user requests
* Keeps controller logic clean and modular

---

### 6️⃣ `UserController.java`

* Console-based controller (User Interface layer)
* Displays menu options such as:

  * Register
  * Login
  * View Available Matches
  * Logout / Exit
* Takes user input using `Scanner`
* Controls application flow and user session

---

### 7️⃣ `DBConnection.java`

* Manages MySQL database connection
* Loads MySQL JDBC driver
* Provides reusable JDBC `Connection` object

---

### 8️⃣ `UserValidator.java`

* Handles input validation logic
* Enforces business rules such as:

  * Age must be between **18 and 60**
* Prevents invalid data from entering the database

---

### 9️⃣ `MainApp.java`

* Entry point of the application
* Starts the program
* Loads the main controller

---

## 🔁 Application Flow

```text
User → UserController → UserService → UserDAO → MySQL Database
```

---

## 🛠 Technologies Used

* Java (Core Java)
* JDBC (Java Database Connectivity)
* MySQL (SQL Database)
* MVC Architecture
* DAO Design Pattern

---

## 🎓 Academic Purpose

This project demonstrates:

* Object-Oriented Programming concepts
* JDBC-based database connectivity
* Clean backend architecture
* Exception handling
* Real-world console application flow

---

## 🚀 How to Run

1. Create the database using `jodidotcom.sql`
2. Add MySQL Connector/J to the `lib` folder
3. Compile the project from `src`:

   ```bash
   javac -cp ".;../lib/mysql-connector-j-8.0.33.jar" com/application/MainApp.java
   ```
4. Run the application:

   ```bash
   java -cp ".;../lib/mysql-connector-j-8.0.33.jar" com.application.MainApp
   ```

---

## 📌 Note

This project is intentionally **console-based** to focus on backend development, database operations, and clean architecture rather than UI design.

---

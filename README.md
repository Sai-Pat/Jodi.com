
---

# Jodi.com – Marriage Bureau

## 📌 Project Overview

**Jodi.com** is a Java-based Marriage Bureau system that manages bride and groom profiles using **CRUD operations**. It uses **SQL** as the backend and **Java** for frontend and business logic. The system simplifies matchmaking, reduces manual work, and keeps records organized.

---

## 📂 Project Structure

```
jodidotcom/
│
├── src/
│   └── com/
│       ├── application/
│       │   └── MainApp.java
│       │
│       ├── controller/
│       │   └── UserController.java
│       │
│       ├── model/
│       │   └── User.java
│       │
│       ├── dao/
│       │   ├── UserDAO.java
│       │   └── UserDAOImpl.java
│       │
│       ├── service/
│       │   ├── UserService.java
│       │   └── UserServiceImpl.java
│       │
│       ├── util/
│       │   ├── DBConnection.java
│       │   ├── LanguageUtil.java
│       │   └── VoiceUtil.java
│       │
│       └── validation/
│           ├── Validator.java
│           └── UserValidator.java
│
├── lib/
│   └── mysql-connector-j-8.0.33.jar
│
├── sql/
│   └── jodidotcom.sql
│
├── README.md
└── .gitignore
```

> **Note:** Add `.gitkeep` files in empty folders so Git preserves them.

---

## 📄 File Details

1️⃣ User.java

Model (Entity) class

Represents a bride/groom profile

Contains variables such as:

name

age

gender

email

city

profession

lookingFor

Implements encapsulation using private fields

Includes public getters and setters

2️⃣ UserDAO.java

Data Access Object (DAO) interface

Defines database operations related to users

Declares methods for:

user registration

login authentication

fetching matches

Helps separate database logic from business logic

3️⃣ UserDAOImpl.java

Implementation class of UserDAO

Contains actual JDBC code

Performs Create, Read, Update, Delete (CRUD) operations

Uses PreparedStatement and ResultSet

Handles SQL and database-related exceptions

4️⃣ UserService.java

Service layer interface

Contains business logic method definitions

Acts as a bridge between Controller and DAO

Ensures validation and processing before database access

5️⃣ UserServiceImpl.java

Implementation of UserService

Calls DAO methods to perform operations

Keeps controller logic clean and modular

6️⃣ UserController.java

Console-based User Interface (Controller)

Displays menu options:

Register

Login

View Available Matches

Logout / Exit

Takes user input using Scanner

Controls application flow and user session

7️⃣ DBConnection.java

Manages database connectivity

Loads MySQL JDBC Driver

Provides reusable JDBC Connection object

Centralizes database configuration

8️⃣ Validator.java

Base validation interface

Used to define validation structure

9️⃣ UserValidator.java

Handles user-specific validation logic

Enforces rules such as:

age must be between 18 and 60

Prevents invalid data from reaching the database

🔟 MainApp.java

Entry point of the application

Starts the program

Initializes the controller and loads the main menu

🔁 Application Flow
User → UserController → UserService → UserDAO → MySQL Database

🛠 Technologies Used

Java (Core Java)

JDBC (Java Database Connectivity)

MySQL (SQL)

MVC Architecture

DAO Design Pattern

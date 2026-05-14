# Student Management Application

## 📌 Project Overview
A robust Java-based application designed to manage student records through a structured backend and relational database. 
This system demonstrates core enterprise development principles, including CRUD operations, data persistence, and input validation.

## 🚀 Features
*   **Full CRUD Functionality:** Create, Read, Update, and Delete student records with ease.
*   **Database Integration:** Seamlessly interacts with a relational database (SQL) for persistent storage.
*   **Input Validation:** Ensures data integrity by validating student information before processing.
*   **Modular Architecture:** Built with maintainability in mind, following clean code practices.

## 🛠 Tech Stack
📂 Project Structure/src: Contains the Java source files, organized by logical layers (UI, Business Logic, Data Access). 
/lib: 
External libraries and SQL drivers required for database connectivity.  
/db: 
SQL scripts for table creation and sample data seeding.  
🏗 System ArchitectureThe application follows a standard Tiered Architecture to ensure the code is maintainable and testable:  
Presentation Layer: Handles user input and displays data via the Java console or GUI.  
Service Layer: Contains the business logic for student record management and validation.  
Data Access Layer (DAO): Manages all SQL queries and CRUD operations directly with the database.  
🔐 Key Implementation DetailsPrepared Statements: Used to prevent SQL Injection and ensure secure data handling.  
Exception Handling: Robust try-catch blocks to manage database connection issues and runtime errors.  
Object-Relational Mapping (Manual): Mapping Java objects to SQL table rows to maintain data integrity.  
📈 Future RoadmapSpring Boot Migration: Transitioning the current DAO layer to Spring Data JPA for enterprise-grade scalability.  
RESTful API: Implementing a controller layer to expose student data as JSON endpoints.  
Unit Testing: Adding JUnit test cases to ensure 100% coverage of core business logic.  
*   **Language:** Java
*   **Database:** SQL (MySQL/MSSQL)
*   **Version Control:** Git

## 📋 Installation & Setup
1. Clone the repository:
   ```bash
   git clone [https://github.com/Lefakatleho14/Student-application.git](https://github.com/Lefakatleho14/Student-application.git)

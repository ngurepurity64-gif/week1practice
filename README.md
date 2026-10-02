Week 1 Practice — Java Programming and Clothing Inventory Manager

Overview

This repository contains Java programming exercises and a console-based Clothing Inventory Manager developed as part of my programming coursework.

The project demonstrates my understanding of fundamental Java programming concepts, basic inventory management, file persistence, exception handling, and introductory database schema design.

Project Objectives

- Practise Java syntax and object-oriented programming fundamentals.
- Develop small programs to solve basic programming problems.
- Implement a menu-driven clothing inventory application.
- Store and retrieve inventory data using file handling.
- Practise database table design using SQL.
- Apply Git and GitHub for version control and project management.

Main Application: Clothing Inventory Manager

The Clothing Inventory Manager is a Java console application that allows users to:

- Add clothing items and their quantities.
- View available clothing items and quantities.
- Save inventory data to "clothes.txt".
- Load previously saved inventory when the application starts.
- Update an existing item's quantity by entering its name again.

A Java "Map" is used to manage clothing names and quantities, while file handling maintains inventory data between program runs.

Other Java Exercises

The "src/" directory contains additional programming exercises covering topics such as:

- Conditional statements and loops.
- User input and output.
- Classes and methods.
- Collections and maps.
- Exception handling.
- Password checking.
- Basic calculations and problem-solving.

Technologies and Tools

- Programming language: Java
- Development environment: IntelliJ IDEA / Visual Studio Code
- Version control: Git
- Remote repository: GitHub
- Database practice: SQL schema design

Repository Structure

- "src/" — Java source files and programming exercises.
- "clothes.txt" — File used to store clothing inventory data.
- "schema.sql" — SQL database schema for the ClothingStore tables.
- ".gitignore" — Files and directories excluded from version control.
- "README.md" — Project documentation.

Running the Clothing Inventory Manager

Prerequisites

- A compatible Java Development Kit (JDK).
- A terminal or Java-compatible IDE.

Instructions

1. Clone the repository from GitHub.
2. Open the project folder in your preferred IDE.
3. Compile the Java source files.
4. Run "ClothingInventoryManager.java".
5. Follow the console menu instructions.

From the project root, you can compile the source files using:

"javac src\*.java"

Then run the application from the project root using:

"java -cp src ClothingInventoryManager"

Database Schema

The "schema.sql" file contains the proposed database structure for a clothing store, including:

- "Clothes"
- "Customers"
- "Orders"
- "OrderItems"

The schema provides practice in organizing clothing inventory, customer information, and order-related data. Database connectivity from the Java application is not claimed here.

Version Control

Git is used to track changes throughout development, while GitHub hosts the repository for backup, review, and demonstration of development progress.

Future Improvements

Potential improvements include:

- Input validation for clothing quantities.
- Support for clothing names containing spaces.
- Search and filtering functionality.
- Database integration with the inventory application.
- Automated tests and improved error handling.
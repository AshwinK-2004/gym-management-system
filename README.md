# Gym Management System

A full-stack web application built to streamline fitness center operations—covering member subscriptions, trainer allocation, workouts, inventory, and payment processing.

> **Project Context:** Originally built as a Year 2 Semester 2 group project at SLIIT (mirrored from [Pethmin09/gym-management-system](https://github.com/Pethmin09/gym-management-system))[cite: 15].

## Tech Stack

* **Frontend:** React, JavaScript, HTML5, CSS3[cite: 15]
* **Backend:** Java, Spring Boot, REST APIs[cite: 15]
* **Database:** MySQL / MSSQL
* **Tools:** Git, Maven, npm, Cursor, Postman

## Architecture & Modules

* `gym-frontend/`: React single-page application handling client-side routing, dashboard UI, and member workflows.
* `gym-backend/`: Spring Boot REST server structured into controllers, services, repositories, and entity models using JPA/Hibernate.

## Getting Started

### Prerequisites
* Node.js & npm installed
* Java JDK (17 or 21)
* MySQL server running locally

### 1. Run the Backend
```bash
cd gym-backend
mvn spring-boot:run

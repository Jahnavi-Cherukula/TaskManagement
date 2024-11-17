# TaskManagement

## Overview
**TaskManagement** is a task management system built using **Spring Boot** and **Redis** for task storage. It provides a RESTful API that allows users to manage tasks with functionalities to **create**, **read**, **update**, **delete**, and **mark tasks as complete**. 

## Table of Contents
1. [Clone the Repository]
2. [Install Dependencies]
3. [Install Redis]
4. [Configure Application]
5. [Run the Application]

### Features:
- **GET /tasks**: Retrieve all tasks
- **GET /tasks/{id}**: Retrieve a specific task by ID
- **POST /tasks**: Create a new task
- **PUT /tasks/{id}**: Update an existing task
- **DELETE /tasks/{id}**: Delete a task
- **PATCH /tasks/{id}/complete**: Mark a task as complete

## Setup Instructions

### 1. Clone the Repository
To clone the repository:
```bash
git clone https://github.com/Jahnavi-Cherukula/TaskManagement.git
cd TaskManagement

### 2. **Install Dependencies**

Before running the application, ensure that you have **Java 11 or higher** and **Maven** installed.

#### 2.1. **Open the Project in IntelliJ IDEA**

1. Open **IntelliJ IDEA**.
2. Select **Open Project** and navigate to the cloned repository folder.
3. IntelliJ will automatically detect the project as a **Maven project**. If not, ensure that **Maven** is correctly configured in IntelliJ. You can check this in the **Maven** panel on the right side.

#### 2.2. **Add Dependencies**

The required dependencies for **Spring Boot**, **Redis**, and **testing** are already included in the `pom.xml` file.

Here is an example of the dependencies in `pom.xml`:

`







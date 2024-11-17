# TaskManagement
It is a task management system built using Java, Spring Boot, Redis, and Maven. This project provides a RESTful API that allows users to create, read, update, delete and manage tasks.

#Features:
Task Management: Allows users to create, view, update, delete, and complete tasks.
Auto-generated Task ID: The task ID is generated automatically upon creation using the current timestamp.
Due Date Handling: Users can set due dates for tasks, which are stored and displayed in ISO 8601 format.
Basic Authentication: Secures the API endpoints to ensure that only authorized users can interact with the system.
Error Handling: Proper error handling for cases like missing tasks or invalid inputs.
In-memory Storage with Redis: Uses Redis to store tasks in memory for faster performance.
Technologies:
Backend: Spring Boot
Database: Redis (In-memory store)
Build Tool: Maven
Authentication: Basic Authentication
Java Version: 11 or higher
Endpoints:
GET /tasks: Retrieve all tasks.
GET /tasks/{id}: Retrieve a task by its ID.
POST /tasks: Create a new task.
PUT /tasks/{id}: Update an existing task.
DELETE /tasks/{id}: Delete a task.
PATCH /tasks/{id}/complete: Mark a task as complete.

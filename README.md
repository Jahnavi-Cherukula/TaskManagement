# Task Management API

This project is a Task Management API built with **Spring Boot** and **Redis** for storing tasks. The API allows users to **create**, **read**, **update**, **delete**, and **mark tasks as complete**. This project uses **Redis** as an in-memory data store to handle the tasks.



## 1. **Introduction**

The **Task Management API** is designed to manage tasks effectively. It provides CRUD operations for task management and uses **Redis** for fast storage and retrieval. The API is built with **Spring Boot** and provides endpoints for:

- Creating tasks
- Retrieving tasks (all or by ID)
- Updating tasks
- Deleting tasks
- Marking tasks as complete

---

## 2. **Install Dependencies**

Before running the application, make sure you have the following installed on your machine:

- **Java 11** or higher
- **Maven**
- **Redis** (for storing task data)

### 2.1. **Clone the Repository**

Clone the repository using Git:

```bash
git clone https://github.com/Jahnavi-Cherukula/TaskManagement.git
```
### 2.2. Open the Project in IntelliJ IDEA

1. Open **IntelliJ IDEA**.
2. Click on **Open Project** and navigate to the folder where the repository was cloned.
3. IntelliJ will automatically detect the project as a **Maven project**. If not, ensure Maven is correctly configured in IntelliJ.
   
### 2.3. Add Dependencies
The necessary dependencies for Spring Boot, Redis, and Validation are already included in the `pom.xml` file.

### 2.4. Install the Dependencies Using Maven

After adding dependencies, open the **Maven** panel in IntelliJ and click on **Reload All Maven Projects** to download and install the dependencies automatically.

Alternatively, you can install the dependencies manually by running the following command in the terminal:

```bash
mvn clean install
```
---

### 3. Configure Redis

#### 3.1. Install Redis

If you don't have Redis installed, follow these steps:

- **Windows**: Download and install Redis from [here](https://github.com/microsoftarchive/redis/releases). You may need to use **WSL (Windows Subsystem for Linux)** if you're running Windows.
- **macOS**: Use `brew install redis` to install Redis via Homebrew.
- **Linux**: Use `sudo apt install redis-server` to install Redis.

**Set Redis Path in System Environment Variables**  
   After installing Redis, make sure Redis is added to your system environment variables so that it can be accessed globally. Follow these steps:

   - **Windows**:
     - Right-click on `This PC` or `My Computer` and select `Properties`.
     - Click on `Advanced system settings` and then `Environment Variables`.
     - Under `System Variables`, find and select `Path`, then click `Edit`.
     - Add the path where Redis is installed (e.g., `C:\Program Files\Redis`) to the `Path` variable and click `OK`.
      - 
    **Make Sure Redis Server is Running**  
   To ensure that Redis is running, open a terminal or command prompt and start Redis:
   
   - **Windows**:  
     If you installed Redis as a service, run:
     ```bash
     redis-server
     ```
     -
    **Verify Redis Connection**  
   To verify Redis is running, use the following command in the terminal:
   
   ```bash
   redis-cli ping
   ```
  If Redis is running, you will receive the response: PONG


#### 3.2. Configure Redis in Application

Add the following configuration in your `application.properties` file to connect to the local Redis server:

```properties
spring.redis.host=localhost
spring.redis.port=6379
```

---

### 4. Running the Application

To run the application, you can either use **IntelliJ IDEA** or the **terminal**.

#### 4.1. Running from IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Click on the **Run** button in the top-right corner of IntelliJ to start the application.
3. The application will start at the default port `8080`.

The application will be accessible at http://localhost:8080

---

### 5. Testing the Application

You can test the API using **Postman** or any other API testing tool.

#### 5.1. Test API Endpoints

Here are the available endpoints:

- **POST /tasks**: Create a new task.
- **GET /tasks**: Retrieve all tasks.
- **GET /tasks/{id}**: Retrieve a specific task by ID.
- **PUT /tasks/{id}**: Update an existing task.
- **DELETE /tasks/{id}**: Delete a task.
- **PATCH /tasks/{id}/complete**: Mark a task as complete.

#### 5.2. Test with Postman

You can use **Postman** to test the API:

- **Create a task**:

    - **Method**: POST
    - **URL**: `http://localhost:8080/tasks/create`
    - **Body (JSON)**:

    ```json
    {
        "title": "Music",
        "description": "Attend music class",
        "due_date": "2024-12-01"
    }
    ```

- **GET all tasks**:

    - **Method**: GET
    - **URL**: `http://localhost:8080/tasks/getAll`

- **GET a specific task by ID**:

    - **Method**: GET
    - **URL**: `http://localhost:8080/tasks/getById/{id}`


- **Update a task**:

    - **Method**: PUT
    - **URL**: `http://localhost:8080/tasks/update/{id}`
    - **Body (JSON)**:

    ```json
    {
        "title": "Updated Music",
        "description": "Updated description",
        "due_date": "2024-12-02"
    }
    ```

- **Delete a task**:

    - **Method**: DELETE
    - **URL**: `http://localhost:8080/tasks/delete/{id}`

- **Mark task as complete**:

    - **Method**: PATCH
    - **URL**: `http://localhost:8080/tasks/complete/{id}`






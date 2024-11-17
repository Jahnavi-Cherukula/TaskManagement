package com.example.Wellness360.Controller;

import com.example.Wellness360.model.Task;
import com.example.Wellness360.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Create a new task
    @PostMapping("/create")
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        try {
            taskService.createTask(task);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Task got added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Failed to create task");
        }
    }

    // Retrieve all tasks
    @GetMapping("/getAll")
    public Iterable<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Retrieve a task by ID
    @GetMapping("/getById/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable String id) {
        try {
            Task task = taskService.getTaskById(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(task);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }


    // Update an existing task
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTask(@PathVariable String id, @RequestBody Task updatedTask) {
        try {
            taskService.updateTask(id, updatedTask);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("Task updated successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Task not found");
        }
    }

    // Delete a task
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable String id) {
        try {
            taskService.deleteTask(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("Task deleted successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Task not found");
        }
    }

    // Mark task as completed
    @PatchMapping("/complete/{id}")
    public ResponseEntity<String> markTaskAsComplete(@PathVariable String id) {
        try {
            taskService.markTaskAsComplete(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("Task marked as complete");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Task not found");
        }
    }
}




package com.example.Wellness360.service;

import com.example.Wellness360.model.Status;
import com.example.Wellness360.model.Task;
import com.example.Wellness360.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {

    @Autowired
    private taskRepository taskRepo;

    // Retrieve all tasks
    public Iterable<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    // Retrieve a task by ID
    public Task getTaskById(String id) {
        return taskRepo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    // Create a new task
    public Task createTask(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());
        task.setStatus(Status.PENDING);
        return taskRepo.save(task);
    }

    // Update an existing task
    public Task updateTask(String id, Task updatedTask) {
        Task existingTask = getTaskById(id);
        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setDueDate(updatedTask.getDueDate());
        existingTask.setUpdatedAt(LocalDateTime.now());
        return taskRepo.save(existingTask);
    }

    // Delete a task
    public void deleteTask(String id) {
        if (!taskRepo.existsById(id)) {
            throw new RuntimeException("Task not found");
        }
        taskRepo.deleteById(id);
    }

    // Mark task as completed
    public Task markTaskAsComplete(String id) {
        Task task = getTaskById(id);
        task.setStatus(Status.COMPLETED);
        task.setUpdatedAt(LocalDateTime.now());
        return taskRepo.save(task);
    }
}


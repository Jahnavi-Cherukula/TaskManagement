package com.example.Wellness360.model;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@RedisHash("Task")
@Getter
@Setter
public class Task implements Serializable {


        private String id;

        @NotBlank(message = "Title is required")
        private String title;

        private String description;

        @FutureOrPresent(message = "Due date must be in the future or present")
        private LocalDateTime dueDate;

        private Status status; // Enum for status

        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Task() {
                this.id = UUID.randomUUID().toString();
                this.createdAt = LocalDateTime.now();
                this.updatedAt = LocalDateTime.now();
                this.status = Status.PENDING;
        }


}

package com.example.Wellness360.repository;


import com.example.Wellness360.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface taskRepository extends CrudRepository<Task, String> {

}


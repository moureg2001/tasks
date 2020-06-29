package com.springframework.tasks.service;

import com.springframework.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> getTask();

    Task save(Task task);
}

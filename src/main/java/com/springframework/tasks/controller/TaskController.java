package com.springframework.tasks.controller;

import com.springframework.tasks.domain.Task;
import com.springframework.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> getTask() {
        return this.taskService.getTask();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return  taskService.save(task);
    }
}

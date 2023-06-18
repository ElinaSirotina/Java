package com.rest.rest.controller;

import com.rest.rest.entity.Todo;
import com.rest.rest.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {
    @Autowired
    private ToDoRepository todoRepository;

    @GetMapping("")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Todo createNewTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }
}

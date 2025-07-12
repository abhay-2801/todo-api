package com.example.crudapi.service;

import com.example.crudapi.model.Todo;
import com.example.crudapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repo;

    public List<Todo> findAll() { return repo.findAll(); }
    public Todo save(Todo todo) { return repo.save(todo); }
    public void delete(Long id) { repo.deleteById(id); }
    public Optional<Todo> findById(Long id) { return repo.findById(id); }
}

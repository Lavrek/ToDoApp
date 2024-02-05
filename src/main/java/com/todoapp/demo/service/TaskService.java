package com.todoapp.demo.service;

import com.todoapp.demo.model.Category;
import com.todoapp.demo.model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTasks();

    public void save(Task task);

    public void deleteById(Long id);

    public Character update(Long id, Character character);

    public Task findById(Long id);

    public Task findByName(String name);

    public List<Task> findByUrgency(int urgency);

    public List<Task> findByComplexity(int complexity);

    public List<Task> findByCategory(Category category);

    public List<Task> findByEndTime(String endDate);

    public List<Task> findByStartTime(String startDate);
}

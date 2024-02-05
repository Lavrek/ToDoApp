package com.todoapp.demo.service;

import com.todoapp.demo.model.Category;
import com.todoapp.demo.model.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public void save(Task task) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Character update(Long id, Character character) {
        return null;
    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public Task findByName(String name) {
        return null;
    }

    @Override
    public List<Task> findByUrgency(int urgency) {
        return null;
    }

    @Override
    public List<Task> findByComplexity(int complexity) {
        return null;
    }

    @Override
    public List<Task> findByCategory(Category category) {
        return null;
    }

    @Override
    public List<Task> findByEndTime(String endDate) {
        return null;
    }

    @Override
    public List<Task> findByStartTime(String startDate) {
        return null;
    }
}

package com.todoapp.demo.model;

import java.time.LocalDateTime;
import java.time.Period;

public class Task {

    private long id;
    private String name;
    private String description;
    private int urgency;
    private int complexity;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Period period;
    private Category category;
}

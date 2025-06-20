package com.example.productivity_app.dto;

import com.example.productivity_app.entity.Task;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GetTasksResponseDTO {
    private String message;


    @Getter
    private List<Task> tasksList = new ArrayList<>();
    public String getMessage() {
        return message;
    }

    public void addTasks(List<Task> tasks) {
        tasksList.addAll(tasks);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

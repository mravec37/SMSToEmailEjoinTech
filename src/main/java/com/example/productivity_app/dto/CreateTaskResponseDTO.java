package com.example.productivity_app.dto;

import com.example.productivity_app.entity.Task;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskResponseDTO {
    private String message;
    private Task task;
}

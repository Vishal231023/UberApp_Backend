package com.codingshuttle.project.uber.uberApp.advices;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {

    //@JsonFormat(pattern = "hh:mm:ss dd:mm:yyyy")
    private LocalDateTime timeStamp;
    private T data;
    private ApiError apiError;

    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }

    public  ApiResponse(T data){
        this();
        this.data = data;
    }

    public ApiResponse( ApiError apiError){
        this();
        this.apiError = apiError;
    }
}

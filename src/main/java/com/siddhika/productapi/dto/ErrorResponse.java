package com.siddhika.productapi.dto;

public class ErrorResponse {
    private Object message;
    private int status;

    public ErrorResponse(int status, Object message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public Object getMessgage() {
        return message;
    }
    
}

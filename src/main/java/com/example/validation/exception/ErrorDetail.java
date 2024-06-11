// src/main/java/com/example/validation/exception/ErrorDetail.java
package com.example.validation.exception;

public class ErrorDetail {
    private String field;
    private String message;

    public ErrorDetail(String field, String message) {
        this.field = field;
        this.message = message;
    }

    // getters and setters
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

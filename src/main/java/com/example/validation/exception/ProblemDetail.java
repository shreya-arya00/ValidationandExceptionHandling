package com.example.validation.exception;

import java.util.List;

public class ProblemDetail {
    private int status;
    private String title;
    private String message;
    private List<ErrorDetail> errors;

    public ProblemDetail(int status, String title, String message, List<ErrorDetail> errors) {
        this.status = status;
        this.title = title;
        this.message = message;
        this.errors = errors;
    }

    // Getters and setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }
}

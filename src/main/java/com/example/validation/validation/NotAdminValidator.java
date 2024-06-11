package com.example.validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotAdminValidator implements ConstraintValidator<NotAdmin, String> {

    @Override
    public void initialize(NotAdmin constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Validate that the value is not equal to "admin"
        return value != null && !value.equalsIgnoreCase("admin");
    }
}

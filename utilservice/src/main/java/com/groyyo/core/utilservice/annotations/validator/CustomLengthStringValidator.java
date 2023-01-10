package com.groyyo.core.utilservice.annotations.validator;

import com.groyyo.core.base.exception.GroyyoException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomLengthStringValidator implements ConstraintValidator<ValidCustomLengthString, String> {
    @Override
    public void initialize(ValidCustomLengthString constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || value.trim().isEmpty() )
            throw new GroyyoException("Value is invalid due to empty | null string");
        else if(value.trim().length() > 50){ //todo: update the length & add valid string start character
            throw new GroyyoException("Value is invalid due to string length greater than 50");
        }
        return true;
    }
}

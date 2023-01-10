package com.groyyo.ledger.annotation.validator;

import com.groyyo.ledger.annotation.constraint.NotZeroOrNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZeroOrNullValidator implements ConstraintValidator<NotZeroOrNull, Double> {


    @Override
    public boolean isValid(Double value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && !value.equals(0.0);
    }
}

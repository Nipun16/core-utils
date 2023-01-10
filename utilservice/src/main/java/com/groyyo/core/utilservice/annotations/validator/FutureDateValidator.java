package com.groyyo.core.utilservice.annotations.validator;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.groyyo.core.utilservice.annotations.NotPast;

public class FutureDateValidator implements ConstraintValidator<NotPast, LocalDate> {
    @Override
    public void initialize(NotPast notPast) {
		
	}
	
    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        if(localDate == null)
            return true;
        
        if(localDate.isBefore(LocalDate.now()))
            return false;
        return true;
    }
}

package com.groyyo.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.groyyo.core.base.utils.GroyyoUtils;
import com.groyyo.core.utilservice.annotations.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {

	@Override
	public void initialize(Email constraintAnnotation) {
		/**
		 * default
		 * 
		 */
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		boolean response = true;
		if (StringUtils.isNotBlank(email) && !GroyyoUtils.isValidEmail(email)) {
			response = false;
		}
		return response;
	}

}
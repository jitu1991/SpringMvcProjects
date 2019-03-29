package com.test.mvc.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CountryValidator implements ConstraintValidator<IsValidCountry, String>{

	@Override
	public void initialize(IsValidCountry arg0) {
		
	}

	@Override
	public boolean isValid(String country, ConstraintValidatorContext arg1) {
		if(country == null)
			return false;
		if(country.matches("IND|AUS"))
			return true;
		return false;
	}

}

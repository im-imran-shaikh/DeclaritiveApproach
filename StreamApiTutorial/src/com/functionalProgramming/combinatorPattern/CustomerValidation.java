package com.functionalProgramming.combinatorPattern;

import static com.functionalProgramming.combinatorPattern.CustomerValidation.ValidationResult.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import com.functionalProgramming.combinatorPattern.CustomerValidation.ValidationResult;

public interface CustomerValidation extends Function<Customer, ValidationResult>
{

	static CustomerValidation isEmailValid()
	{
		return customer -> (customer.getEmail().get().contains("@") && customer.getEmail().get().contains(".com"))
				? SUCCESS : EMAIL_NOT_VALID;
	}

	static CustomerValidation isDOBValid()
	{
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS
				: DATE_OF_BIRTH_IS_NOT_VALID;
	}

	static CustomerValidation isNameVAlid()
	{
		return customer -> customer.getName().startsWith("I") ? SUCCESS : NAME_IS_NOT_VALID;
	}

	default CustomerValidation and(CustomerValidation other)
	{
		return customer ->
		{
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ? other.apply(customer) : result;
		};
	}

	enum ValidationResult
	{
		SUCCESS, EMAIL_NOT_VALID, NAME_IS_NOT_VALID, DATE_OF_BIRTH_IS_NOT_VALID
	}
}

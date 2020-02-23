package com.functionalProgramming.combinatorPattern;

import static com.functionalProgramming.combinatorPattern.CustomerValidation.*;

import java.time.LocalDate;
import java.util.Optional;

public class _CombinatorPattern
{
	public static void main(String[] args)
	{
		Customer customer = new Customer("Imran", Optional.of("Imran@gmail.com"), LocalDate.of(2000, 1, 1));

		ValidationResult result = isEmailValid()
				.and(isDOBValid())
				.and(isNameVAlid())
				.apply(customer);
		
		System.out.print("result : " + result);
	}
}

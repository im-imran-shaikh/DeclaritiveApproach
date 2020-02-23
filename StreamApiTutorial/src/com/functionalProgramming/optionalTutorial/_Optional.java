package com.functionalProgramming.optionalTutorial;

import java.util.Optional;

public class _Optional
{

	public static void main(String[] args)
	{
		Optional.ofNullable("Imran")
			.ifPresent(value -> System.out.println(value));
		
		Object value = Optional.ofNullable(null).orElseGet(()-> {
			return "Value is not null";
		});
		
		System.out.println(value);
	}

}

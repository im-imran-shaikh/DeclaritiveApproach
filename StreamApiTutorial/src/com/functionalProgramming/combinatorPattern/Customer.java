package com.functionalProgramming.combinatorPattern;

import java.time.LocalDate;
import java.util.Optional;

public class Customer
{
	private String name;
	private Optional<String> email;
	private LocalDate dob;
	
	public Customer(String name, Optional<String> email, LocalDate dob)
	{
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public String getName()
	{
		return name;
	}

	public Optional<String> getEmail()
	{
		return email;
	}

	public LocalDate getDob()
	{
		return dob;
	}

	@Override
	public String toString()
	{
		return "Customer [name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
}

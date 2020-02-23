package com.functionalProframming.declaraticeApproach;

import java.util.function.Supplier;

/**
 * @author Imran Shaikh
 * Supplier Interface is use for not taking any argument and producing a result
 */
public class SupplierTutorila
{

	public static void main(String[] args)
	{
		String firstName = getFirstName.get();
		System.out.println("First Name : " + firstName);
	}

	private final static Supplier<String> getFirstName = () -> "Imran";

}

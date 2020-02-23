package com.functionalProframming.declaraticeApproach;

import java.util.function.Predicate;

/**
 * @author Imran Shaikh
 * Predicate is use for returnning boolean value it take one argument and return boolean vale
 * 
 */

public class PredicateTutorila
{

	static class CustomerInformation
	{
		private int id;
		private String gender;
		private String address;
		
		public CustomerInformation(int id, String gender, String address)
		{
			super();
			this.id = id;
			this.gender = gender;
			this.address = address;
		}

		public int getId()
		{
			return id;
		}

		public String getGender()
		{
			return gender;
		}

		public String getAddress()
		{
			return address;
		}

		@Override
		public String toString()
		{
			return "CustomerInformation [id=" + id + ", gender=" + gender + ", address=" + address + "]";
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(isMalePredicate.test(new CustomerInformation(001, "Male", "Ghatkopar")));
		System.out.println(isMalePredicate.test(new CustomerInformation(002, "Female", "Vikhroli")));
	}
	
	private final static boolean isMale(CustomerInformation customerInformation)
	{
		System.out.println("PredicateTutorila.isMale() is called, " + customerInformation.getGender());
		return customerInformation.getGender().equalsIgnoreCase("Male");
	}
	
	private final static Predicate<CustomerInformation> isMalePredicate = PredicateTutorila::isMale;

}

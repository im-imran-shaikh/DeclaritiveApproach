package com.functionalProgramming.dto;

import java.util.List;

public class Person
{
	private int personId;
	private String personName;
	private String personGender;
	private int personAge;
	
	public Person(int personId, String personName, String personGender, int personAge)
	{
		super();
		this.personId = personId;
		this.personName = personName;
		this.personGender = personGender;
		this.personAge = personAge;
	}

	public int getPersonId()
	{
		return personId;
	}

	public void setPersonId(int personId)
	{
		this.personId = personId;
	}

	public String getPersonName()
	{
		return personName;
	}

	public void setPersonName(String personName)
	{
		this.personName = personName;
	}

	public String getPersonGender()
	{
		return personGender;
	}

	public void setPersonGender(String personGender)
	{
		this.personGender = personGender;
	}

	public int getPersonAge()
	{
		return personAge;
	}

	public void setPersonAge(int personAge)
	{
		this.personAge = personAge;
	}

	@Override
	public String toString()
	{
		return "Person [personId=" + personId + ", personName=" + personName + ", personGender=" + personGender
				+ ", personAge=" + personAge + "]";
	}
	
	
	
}

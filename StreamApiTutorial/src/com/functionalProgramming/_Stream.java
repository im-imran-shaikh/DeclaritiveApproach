package com.functionalProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class _Stream
{

	public static void main(String[] args)
	{
		List<Person> persons = Arrays.asList(
				new Person(001, "Imran", Gender.Male),
				new Person(002, "Arjun", Gender.Male),
				new Person(003, "Sujata", Gender.Female),
				new Person(004, "No Name", Gender.Other)
				);
		
		System.out.println("Declarative approach");
		
		persons.stream()
			.map(person -> person.gender)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		boolean genderMatch = persons.stream()
				.noneMatch(person -> person.getGender().equals(Gender.Should_Not_Match));
		System.out.println("is gender match : " + genderMatch);
		
		persons.stream()
				.filter(person -> person.getGender().equals(Gender.Male))
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		
		System.out.println("Imperative approach");
		
		Set<Enum> gender = new HashSet<>();
		for (Person person : persons)
			gender.add(person.getGender());
		
		Iterator<Enum> genderIterator = gender.iterator();
		while (genderIterator.hasNext())
		{
			Enum Persongender = genderIterator.next();
			System.out.println(Persongender);
		}
		

	}

	private final static class Person
	{
		private int id;
		private String name;
		private Enum gender;

		public Person(int id, String name, Enum gender)
		{
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
		}

		public int getId()
		{
			return id;
		}

		public String getName()
		{
			return name;
		}

		public Enum getGender()
		{
			return gender;
		}

		@Override
		public String toString()
		{
			return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
		}
	}

	private static enum Gender
	{
		Male, Female, Other, Should_Not_Match
	}
}

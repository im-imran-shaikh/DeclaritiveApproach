package com.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.functionalProgramming.dto.Person;
 
public class Application
{
	public static void main(String[] args)
	{
		System.out.println("Application.main()");
		List<Person> persons = getPersons();
		List<Person> male = persons.stream().filter(person -> person.getPersonGender().equals("")).collect(Collectors.toList());
		male.forEach(System.out::println);
		
		System.out.println(incrementByOneFnction.apply(10));
		System.out.println(perform.apply("Shaikh"));
		
		Function<Integer,Integer> total = incrementByOneFnction.andThen(multiplyBy10);
		System.out.println("Total : " + total.apply(10));

	}
	
	private static Function<Integer, Integer> incrementByOneFnction = number -> number +1;
	private static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	
	private static Function<String, String> perform =  name -> getName(name); 
	
	private static String getName(String name)
	{
		if (name == "Imran") return "Imran";
		else return "Name is not imran";

	}
	
	private static List<Person> getPersons()
	{
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(001, "John Cena", "Male", 29));
		persons.add(new Person(002, "Priyanka Sharma", "Female", 30));
		persons.add(new Person(003, "Roman Reign", "Male", 31));

		return persons;
	}
}

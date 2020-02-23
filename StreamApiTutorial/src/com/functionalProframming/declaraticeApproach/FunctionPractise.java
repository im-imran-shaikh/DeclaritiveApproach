package com.functionalProframming.declaraticeApproach;

import java.util.function.BiFunction;

/**
 * @author Imran Shaikh
 * Functional is used to accept one argument and return 
 */

public class FunctionPractise
{

	public static void main(String[] args)
	{
		System.out.println("ByFunctional : " + biFunction.apply(10, 100));
	}
	
	
	private static BiFunction<Integer, Integer, Integer> biFunction = 
			(incrementByOne, multiplyBy) ->
				(incrementByOne + 1) * multiplyBy;
				
	private Integer addOneAndMul(Integer addOne, Integer mul)
	{
		return (addOne + 1) * mul;
	}

}

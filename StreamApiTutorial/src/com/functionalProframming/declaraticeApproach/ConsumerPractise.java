package com.functionalProframming.declaraticeApproach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Imran Shaikh
 * Consmer is used to accept one argument and does not produce result (retuen statement)
 * Biconsumer is sed to accept two argument and does not produce produce result (return statement)
 */
public class ConsumerPractise
{

	static class Products
	{
		private int productId;
		private String productDescription;

		public Products(int productId, String productDescription)
		{
			super();
			this.productId = productId;
			this.productDescription = productDescription;
		}
	
		public void setProductId(int productId)
		{
			this.productId = productId;
		}

		public void setProductDescription(String productDescription)
		{
			this.productDescription = productDescription;
		}

		public int getProductId()
		{
			return productId;
		}

		public String getProductDescription()
		{
			return productDescription;
		}

		@Override
		public String toString()
		{
			return "products [productId=" + productId + ", productDescription=" + productDescription + "]";
		}

	}

	public static void main(String[] args)
	{
		nameValidate.andThen(nameValidate).accept("Imran");
		List<Products> listOfProducts = new ArrayList<>();
		biConsumer.accept(new Products(001, "15.6 inch HP Laptop"), listOfProducts);
		biConsumer.accept(new Products(002, "15.6 inch Dell Laptop"), listOfProducts);
		listOfProducts.stream().forEach(System.out::println);
	}

	private static Consumer<String> nameValidate = name ->
	{
		name = name.equalsIgnoreCase("imran") ? "Hello " + name : "Name does not match";
		System.out.println(name);
	};

	private final static BiConsumer<Products, List<Products>> biConsumer = (products, listOfProducts) -> 
		listOfProducts.add(products);
		
}

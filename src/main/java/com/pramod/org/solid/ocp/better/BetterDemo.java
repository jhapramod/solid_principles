package com.pramod.org.solid.ocp.better;

import java.util.ArrayList;
import java.util.List;

import com.pramod.org.solid.ocp.Color;
import com.pramod.org.solid.ocp.Product;
import com.pramod.org.solid.ocp.Size;


public class BetterDemo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", Size.SMALL, Color.GREEN));
		products.add(new Product("Apple", Size.SMALL, Color.RED));
		
		products.add(new Product("Tree", Size.LARGE, Color.GREEN));
		
		products.add(new Product("House", Size.LARGE, Color.BLUE));
		
		ProductFilter filter = new ProductFilter();
		filter.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(p.getName() + " is Green") );

	}

}

package com.pramod.org.solid.ocp.better;

import com.pramod.org.solid.ocp.Color;
import com.pramod.org.solid.ocp.Product;

public class ColorSpecification implements Specification<Product>{

	private Color color;

	  public ColorSpecification(Color color) {
	    this.color = color;
	  }
	  
	@Override
	public boolean isSatified(Product p) {
		return p.getColor() == color;
	}
	
}

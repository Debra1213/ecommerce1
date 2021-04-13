package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.thymeleaf.expression.Strings;

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	int quantity;
	double price;
	

	Strings description;
	Strings name;
	Strings brand;
	Strings category;
	Strings image;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
			
			
}

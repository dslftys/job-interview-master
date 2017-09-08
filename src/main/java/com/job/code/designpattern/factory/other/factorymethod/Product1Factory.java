package ch5.factorymethod;

import ch4.simplefactory.*;
public class Product1Factory implements Factorymethod{
	public Product factoryMethod(){
		return new Product1();
	}
}

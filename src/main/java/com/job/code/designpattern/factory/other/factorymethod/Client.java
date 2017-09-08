package ch5.factorymethod;

import ch4.simplefactory.*;

public class Client {
	public static void main(String[] args) {
		Factorymethod fm=new Product1Factory();
		Product pro=fm.factoryMethod();
		System.out.println(pro.operation1());
	}
}

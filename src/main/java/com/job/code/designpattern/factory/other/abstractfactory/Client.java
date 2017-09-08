package ch6.abstractfactory;

public class Client {
	public static void main(String[] args) {
		FactoryMethod factoryMethod=new EnglishFactoryMethod();
		System.out.println(factoryMethod.sayTxt("≤‚ ‘"));
		factoryMethod=new ChineseFactoryMethod();
		System.out.println(factoryMethod.sayTxt("≤‚ ‘"));
	}
}

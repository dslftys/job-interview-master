package ch4.simplefactory;

public class Client {
	public static void main(String[] args){
		SimpleFactory2 sf=new SimpleFactory2();
		Product pro=sf.createProduct("1");
		System.out.println(pro.operation1());
		pro=sf.createProduct("2");
		System.out.println(pro.operation1());
	}
}

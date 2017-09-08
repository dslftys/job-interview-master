package BigBirdDesignPatterns.ch6_DecorationPrinciple.person;

public class Person {
	public Person(){
		
	}
	private String name;
	public Person(String name){
		this.name=name;
	}
	
	public void Show(){
		System.out.println("в╟йн╣д"+name);
	}
}

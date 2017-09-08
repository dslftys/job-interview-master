package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	@Override
	public void Operation(){//首先运行原Component的Operation，再执行本类的功能，
		//如addedState，相当于对原Component进行装饰
		super.Operation();
		addedState="New State"; 
		System.out.println("具体装饰对象A的操作");
		
	}
}

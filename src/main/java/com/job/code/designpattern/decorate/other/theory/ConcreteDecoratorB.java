package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class ConcreteDecoratorB extends Decorator {
	@Override
	public void Operation(){//首先运行原Component的Operation，再执行本类的功能，
		//如addedState，相当于对原Component进行装饰
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象A的操作");
		
	}
	private void AddedBehavior(){
		
	}
}

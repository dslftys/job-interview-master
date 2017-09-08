package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 装饰的方法是：首先用ConcreteComponent实例化对象c，然后用ConcreteDecoratorA的实例化对象d1来包装c
 * 再用ConcreteDecoratorB的对象d2包装d1，最终执行d2的Operation
 */
public class DecoratorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ConcreteComponent c=new ConcreteComponent();
		ConcreteDecoratorA ca=new ConcreteDecoratorA();
		ConcreteDecoratorB cb=new ConcreteDecoratorB();
		
		ca.SetComponent(c);
		cb.SetComponent(ca);
		cb.Operation();
	}

}
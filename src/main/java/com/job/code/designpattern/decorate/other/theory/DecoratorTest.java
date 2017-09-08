package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * װ�εķ����ǣ�������ConcreteComponentʵ��������c��Ȼ����ConcreteDecoratorA��ʵ��������d1����װc
 * ����ConcreteDecoratorB�Ķ���d2��װd1������ִ��d2��Operation
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
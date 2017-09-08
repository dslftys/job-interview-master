package BigBirdDesignPatterns.ch10_templeteMethodPattern.theory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TempleteTest {

	@Test
	public void test() {
		AbstractClass ac;
		ac=new ConcreteClassA();
		ac.TemplateMethod();
		
		ac=new ConcreteClassB();
		ac.TemplateMethod();
	}

}

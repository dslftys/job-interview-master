package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class ConcreteDecoratorB extends Decorator {
	@Override
	public void Operation(){//��������ԭComponent��Operation����ִ�б���Ĺ��ܣ�
		//��addedState���൱�ڶ�ԭComponent����װ��
		super.Operation();
		AddedBehavior();
		System.out.println("����װ�ζ���A�Ĳ���");
		
	}
	private void AddedBehavior(){
		
	}
}

package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	@Override
	public void Operation(){//��������ԭComponent��Operation����ִ�б���Ĺ��ܣ�
		//��addedState���൱�ڶ�ԭComponent����װ��
		super.Operation();
		addedState="New State"; 
		System.out.println("����װ�ζ���A�Ĳ���");
		
	}
}

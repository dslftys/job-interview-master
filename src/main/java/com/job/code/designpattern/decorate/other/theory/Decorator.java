package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;
//װ�γ����࣬�̳�Component,����������չComponent��Ĺ��ܣ�������Component��˵������֪��Decorator�Ĵ���
//����ConcreteDecorator���Ǿ����װ�ζ����𵽸�Component���ְ��Ĺ���
public class Decorator extends Component {
	protected Component component;
	public void SetComponent(Component component){
		this.component=component;
	}
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.Operation();
		}
	}

}

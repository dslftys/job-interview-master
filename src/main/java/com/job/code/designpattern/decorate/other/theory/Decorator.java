package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;
//装饰抽象类，继承Component,从外类来扩展Component类的功能，但对于Component来说，无需知道Decorator的存在
//对于ConcreteDecorator就是具体的装饰对象，起到给Component添加职责的功能
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

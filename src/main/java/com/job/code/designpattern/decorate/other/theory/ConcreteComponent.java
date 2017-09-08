package BigBirdDesignPatterns.ch6_DecorationPrinciple.theory;

//定义的具体对象，也可以给这个对象添加一些职责。
public class ConcreteComponent extends Component {

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("具体对象的操作");
	}

}

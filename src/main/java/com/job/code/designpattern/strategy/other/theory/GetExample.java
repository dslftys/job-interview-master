package BigBirdDesignPatterns.strategypattern.theory;

public class GetExample {
	public static void main(String[] args) {
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		context=new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}
}

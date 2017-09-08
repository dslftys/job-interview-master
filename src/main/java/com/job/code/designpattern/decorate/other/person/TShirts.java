package BigBirdDesignPatterns.ch6_DecorationPrinciple.person;

public class TShirts extends Finery {
	@Override
	public void Show(){
		System.out.println("¥ÛT");
		super.Show();
	}
}


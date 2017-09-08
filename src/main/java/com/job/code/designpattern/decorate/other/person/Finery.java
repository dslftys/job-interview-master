package BigBirdDesignPatterns.ch6_DecorationPrinciple.person;
//∑˛ Œ¿‡
public class Finery extends Person {
	protected Person component;
	//¥Ú∞Á
	public void Decorate(Person component){
		this.component=component;
	}
	@Override
	public void Show(){
		if(component!=null){
			component.Show();
		}
	}
}

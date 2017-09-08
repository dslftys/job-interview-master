package ch6.abstractfactory;

public class ChineseFactoryMethod extends FactoryMethod {

	@Override
	public  Translate factoryMethodTranslate() {
		// TODO Auto-generated method stub
		return new ChineseTranslate();
	}

	@Override
	public Interpret factoryMethodInterpret() {
		// TODO Auto-generated method stub
		return new ChineseInterpret();
	}

	@Override
	public Speech factoryMethodSpeech() {
		// TODO Auto-generated method stub
		return new ChineseSpeech();
	}

}

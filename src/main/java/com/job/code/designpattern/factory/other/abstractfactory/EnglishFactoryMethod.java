package ch6.abstractfactory;

public class EnglishFactoryMethod extends FactoryMethod {

	@Override
	public  Translate factoryMethodTranslate() {
		// TODO Auto-generated method stub
		return new EnglishTranslate();
	}

	@Override
	public Interpret factoryMethodInterpret() {
		// TODO Auto-generated method stub
		return new EnglishInterpret();
	}

	@Override
	public Speech factoryMethodSpeech() {
		// TODO Auto-generated method stub
		return new EnglishSpeech();
	}

}

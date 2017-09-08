package ch6.abstractfactory;

public abstract class FactoryMethod {
	protected abstract Translate factoryMethodTranslate();
	protected abstract Interpret factoryMethodInterpret();
	protected abstract Speech factoryMethodSpeech();
	/*
	 * 需要翻译的话语
	 */
	public String sayTxt(String txt){
		Translate translate =factoryMethodTranslate();
		Interpret interpret =factoryMethodInterpret();
		Speech speech =factoryMethodSpeech();
		return translate.sayTxt(txt)+"---"+interpret.doInterpret(txt)+"---"+speech.doSpeech(txt);
	}
}

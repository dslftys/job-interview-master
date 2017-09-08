package ch6.abstractfactory;

public class EnglishTranslate implements Translate {

	public String sayTxt(String txt) {
		return "Hello:" + txt;
	}

}

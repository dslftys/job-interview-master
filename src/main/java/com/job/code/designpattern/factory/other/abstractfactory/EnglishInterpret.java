package ch6.abstractfactory;

public class EnglishInterpret implements Interpret {

	public String doInterpret(String txt) {
		return "English Interpret:" + txt;
	}

}

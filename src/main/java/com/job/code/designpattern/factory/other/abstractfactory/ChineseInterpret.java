package ch6.abstractfactory;

public class ChineseInterpret implements Interpret {

	public String doInterpret(String txt) {
		return "解释中文语义" + txt;
	}

}

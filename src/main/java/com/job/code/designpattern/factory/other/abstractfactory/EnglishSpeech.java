package ch6.abstractfactory;

public class EnglishSpeech implements Speech {

	public String doSpeech(String txt) {
		return "Speech Sound" + txt;
	}

}

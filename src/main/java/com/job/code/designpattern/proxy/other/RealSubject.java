package BigBirdDesignPatterns.proxyPattern;

public class RealSubject extends Subject {

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("真实的请求");
	}

}

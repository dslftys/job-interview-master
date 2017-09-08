package BigBirdDesignPatterns.proxyPattern;

public class Proxy extends Subject {
	Subject realSubject;
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		realSubject.Request();
	}
	
}

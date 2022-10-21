package ex04_proxyPattern;

public class RealSubject implements ProxyInterface {

	@Override
	public void printStatement() {
		System.out.println("Proxy Check");
		
	}

}

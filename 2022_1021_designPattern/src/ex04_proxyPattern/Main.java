package ex04_proxyPattern;

public class Main {

	public static void main(String[] args) {
		
		ProxyInterface proxyInterface = new Proxy();
		proxyInterface.printStatement();

	}

}

package ex06_proxyPattern;

public class App {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoormanProxy dm = new DoormanProxy(new Doorman());
		dm.getOut(c);
	}
	
}

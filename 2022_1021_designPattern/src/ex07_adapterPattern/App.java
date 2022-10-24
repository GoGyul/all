package ex07_adapterPattern;

public class App {

	public static void main(String[] args) {
		
		TigerAdapter adapter = new TigerAdapter(new OuterTiger());
		DoormanProxy dm = new DoormanProxy(new Doorman());
		dm.getOut(adapter);
		
	}
	
}

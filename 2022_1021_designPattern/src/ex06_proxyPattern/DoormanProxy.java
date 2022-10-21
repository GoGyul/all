package ex06_proxyPattern;

public class DoormanProxy{

	// 컴퍼지션 
	private Doorman doorman = new Doorman();
	
	public DoormanProxy(Doorman doorman) {
		this.doorman = doorman;
	}
	
	public void getOut(Animal a) {
		System.out.println("hello");
		doorman.getOut(a);
	}
	
}

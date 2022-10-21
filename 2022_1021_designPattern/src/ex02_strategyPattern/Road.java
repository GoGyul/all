package ex02_strategyPattern;

public class Road {

	public static void main(String[] args) {
		
		CoffeMachine machine = new CoffeMachine();
		
		String americano = machine.brew(hotChocoBtn());
		System.out.println(americano);

	}
	
	public static CoffeeStrategy americanoBtn() {
		return new AmericanoStrategy();
	}

	public static CoffeeStrategy cafelatteBtn() {
		return new CafelatteStrategy();
	}
	
	public static CoffeeStrategy hotChocoBtn() {
		return new HotChocoStrategy();
	}
	
}

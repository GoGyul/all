package ex02_strategyPattern;

public class AmericanoStrategy implements CoffeeStrategy {

	private static String AMERICANO = "아메리카노";
	
	@Override
	public String brew() {
		return AMERICANO;
	}

	
	
}

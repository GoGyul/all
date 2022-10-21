package ex02_strategyPattern;

public class HotChocoStrategy implements CoffeeStrategy {

	private static final String HOTCHOCO = "핫초코";
	
	@Override
	public String brew() {
		return HOTCHOCO;
	}

	
	
}

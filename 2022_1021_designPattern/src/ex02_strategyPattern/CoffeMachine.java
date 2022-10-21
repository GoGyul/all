package ex02_strategyPattern;

public class CoffeMachine {

	public String brew(CoffeeStrategy cs) {
		return cs.brew();
	}
	
}

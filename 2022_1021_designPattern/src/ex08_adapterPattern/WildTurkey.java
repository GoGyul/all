package ex08_adapterPattern;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("구블 구블");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 난다 칠면조");
	}

}

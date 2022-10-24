package ex07_adapterPattern;

public class TigerAdapter extends Animal {

	private OuterTiger outerTiger;
	
	public TigerAdapter(OuterTiger outerTiger) {
		this.outerTiger = outerTiger;
	}
	
	@Override
	public String getName() {
		return outerTiger.getFullName();
	}

}

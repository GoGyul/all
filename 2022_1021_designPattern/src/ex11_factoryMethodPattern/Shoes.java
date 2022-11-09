package ex11_factoryMethodPattern;

public abstract class Shoes {

	protected String name;
	protected String bottom;
	protected String leather;
	protected boolean hasPattern;
	
	void prepare() {
		System.out.println("완성된 신발을 준비중입니다.");
	}
	
	void packing() {
		System.out.println("신발을 포장하고 있습니다.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBottom() {
		return this.bottom;
	}
	
	public String getLeather() {
		return this.leather;
	}
	
	public boolean getHasPattern() {
		return this.hasPattern;
	}
	
}

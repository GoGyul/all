package ex05_proxyPattern;

public class ProtectionSubjectImpl implements ProtectionInterface {

	String name;
	
	public ProtectionSubjectImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	
	
}

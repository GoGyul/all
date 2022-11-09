package ex11_factoryMethodPattern;

public class JapanShoesStore extends ShoesStore {

	@Override
	Shoes makeShoes(String name) {
		
		if(name.equals("blackShoes")) {
			return new JPStyleBlackShoes();
		}
		if(name.equals("brownShoes")) {
			return new JPStyleBrownShoes();
		}
		if(name.equals("redShoes")) {
			return new JPStyleRedShoes();
		}
		
		return null;
	}

	
	
}

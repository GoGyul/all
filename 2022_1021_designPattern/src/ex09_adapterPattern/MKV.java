package ex09_adapterPattern;

public class MKV implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("MKV 파일 재생중 " + fileName);
	}

	
	
}

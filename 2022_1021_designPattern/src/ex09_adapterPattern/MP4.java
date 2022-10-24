package ex09_adapterPattern;

public class MP4 implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("MP4 파일 재생중" +  fileName);
	}

	
	
}

package ex09_adapterPattern;

public class MP3 implements MediaPlayer {

	@Override
	public void play(String fileName) {
		
		System.out.println("MP3 파일 재생중" + fileName);
		
	}

	
	
}

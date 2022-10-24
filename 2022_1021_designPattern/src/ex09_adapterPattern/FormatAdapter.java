package ex09_adapterPattern;

public class FormatAdapter implements MediaPlayer {

	private MediaPackage media;
	
	public FormatAdapter (MediaPackage m) {
		media = m;
	}
	
	@Override
	public void play(String fileName) {
		System.out.println("어댑터 사용 ----> ");
		media.playFile(fileName);
	}

}

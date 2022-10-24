package ex09_adapterPattern;

public class Main {

	public static void main(String[] args) {
		
		MediaPlayer player = new MP3();
		player.play(" ");

		player = new FormatAdapter(new MP4());
		player.play(" ");
		
		player = new FormatAdapter(new MKV());
		player.play(" ");
		
	}

}

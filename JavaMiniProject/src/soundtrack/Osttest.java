
package soundtrack;

import javazoom.jl.player.MP3Player;

public class Osttest {

	public static void main(String[] args) {
		
		MP3Player mp3 = new MP3Player();

		mp3.play("C:\\Users\\smhrd\\git\\EscapeGame\\JavaMiniProject\\src\\soundtrack\\DesertHighway.mp3");

		System.out.println("OST 테스트 재생중...");
	
	}

}

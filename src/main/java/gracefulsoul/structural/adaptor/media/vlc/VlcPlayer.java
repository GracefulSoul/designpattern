package gracefulsoul.structural.adaptor.media.vlc;

import gracefulsoul.structural.adaptor.media.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing.
	}

}

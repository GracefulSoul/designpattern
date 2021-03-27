package gracefulsoul.structural.adaptor.media.audio;

import gracefulsoul.structural.adaptor.media.MediaAdaptor;
import gracefulsoul.structural.adaptor.media.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdaptor mediaAdapter;

	@Override
	public void play(AudioType audioType, String fileName) {
		// Inbuilt support to play mp3 music files.
		switch (audioType) {
			case MP3:
				System.out.println("Playing mp3 file. Name : " + fileName);
				break;
			case VLC:
			case MP4:
				mediaAdapter = new MediaAdaptor(audioType);
				mediaAdapter.play(audioType, fileName);
				break;
			default:
				System.out.println("Invaild media. " + audioType + " format not supported.");
				break;
		}
	}

}

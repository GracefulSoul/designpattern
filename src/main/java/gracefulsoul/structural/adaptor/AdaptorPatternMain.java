package gracefulsoul.structural.adaptor;

import gracefulsoul.structural.adaptor.media.audio.AudioPlayer;
import gracefulsoul.structural.adaptor.media.audio.AudioType;

public class AdaptorPatternMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play(AudioType.MP3, "Beyond the horizen.mp3");
		audioPlayer.play(AudioType.MP4, "Alone.mp4");
		audioPlayer.play(AudioType.VLC, "Far far away.vlc");
		audioPlayer.play(AudioType.AVI, "Mind me.avi");
	}

}

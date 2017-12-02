package fileinput;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MusicModel implements Serializable{

	String artist, song;

	public MusicModel(String artist, String song) {
		this.artist = artist;
		this.song = song;
	}
	
}

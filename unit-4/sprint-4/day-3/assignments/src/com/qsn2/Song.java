package com.qsn2;

import java.util.Objects;

public class Song {
	
	private String movieName ;
	private String songName ;
	
	public void play() {
		
		System.out.println(this.getSongName()+" of "+this.getMovieName()+" is playing.....!");
		
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Song s1 = this ;
		Song s = (Song)obj;
		return (s1.movieName.equals(s.movieName)&&s1.songName.equals(s.songName));
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(movieName,songName) ;
	}
	
	
	
}

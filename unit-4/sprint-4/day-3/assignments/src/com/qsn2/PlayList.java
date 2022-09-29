package com.qsn2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs = new ArrayList<>() ;
	
	public void addSong(Song song) {
		
		if(songs.size()==0) {
			songs.add(song);
			System.out.println("Song added to the playlist successfully....!");
		}else if(songs.size()!=0) {
			
			for(Song ss:songs) {
				
				if(ss.getMovieName().equals(song.getMovieName())&&ss.getSongName().equals(song.getSongName())){
					
					System.out.println("Song is already added in the playlist");
					break ;
					
				}else {
					songs.add(song);
					System.out.println("Song added to the playlist successfully....!");
					break ;
				}
			}
			
		}
		
		
	}
	
}

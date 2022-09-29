package com.qsn2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		PlayList p = new PlayList();
		Song s1 = new Song("Tere nam", "Chubulpandey");
		Song s2 = new Song("hiiii", "War");
		Song s3 = new Song("hywee", "dj");
		Song s4 = new Song("Tere nam", "Chubulpandey");
		
		
		 p.addSong(s1);
		 p.addSong(s2);
		 p.addSong(s3);
		 p.addSong(s4);
		 
		 System.out.println();
		 System.out.println("======================================");
		 
		 List<Song> songs = p.songs;
		 
		 for(Song s:songs) {
			 
			 s.play();
			 System.out.println("================================");
			 
		 }
	}

}

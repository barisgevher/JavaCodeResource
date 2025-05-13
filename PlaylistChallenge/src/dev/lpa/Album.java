package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;

        }else{
            return  false;
        }

    }

    private Song findSong(String title){
        for (Song el : songs){
            if (el.getTitle().equals(title)){
                return el;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumbber, LinkedList<Song> playlist){
        int index = trackNumbber - 1;
        if ((index >= 0) && (index <= songs.size())){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(String title, LinkedList<Song> playlist){
       Song checkedSong = findSong(title);
       if (checkedSong != null){
           playlist.add(checkedSong);
           return true;
       }
       return false;
    }


}

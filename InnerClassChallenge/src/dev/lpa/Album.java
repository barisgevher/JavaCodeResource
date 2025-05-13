package dev.lpa;
import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs; // Testlerin aradığı alan
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>(); // songs alanını başlatıyoruz
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        if (this.songList.add(newSong)) {
            this.songs.add(newSong); // Testler için listeye de ekliyoruz
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = this.songList.findSong(trackNumber);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = this.songList.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if ((trackNumber > 0) && (trackNumber <= this.songs.size())) {
                return this.songs.get(trackNumber - 1);
            }
            return null;
        }
    }



}

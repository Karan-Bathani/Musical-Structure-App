package com.example.musicalstructureapp;

public class Song {

    private int imageId;
    private String songName;
    private String artistName;

    public Song(int imageId, String songName, String artistName) {
        this.imageId = imageId;
        this.songName = songName;
        this.artistName = artistName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }
}

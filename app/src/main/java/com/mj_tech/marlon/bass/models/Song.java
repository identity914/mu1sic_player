package com.mj_tech.marlon.bass.models;


public class Song {
    public long sondId;
    public Artist artist;
    public Album album;
    public String title;
    public long duration;
    public String path;

    public Song(){

        artist = new Artist();
        album = new Album();
    }

}

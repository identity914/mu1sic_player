package com.mj_tech.marlon.bass.models;


public class Album {

    public String title;
    public Artist artist;
    public String artPath;
    public long albumId;

    public Album(){

        this.artist=new Artist();
    }
}

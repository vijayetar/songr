package com.vijayetar.songr;

public class Album {
    //An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s ar
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getSongCount(){
        return songCount;
    }
    public int getLength(){return length;}
    public String getImageUrl(){ return imageUrl;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

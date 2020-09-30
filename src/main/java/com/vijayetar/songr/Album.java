package com.vijayetar.songr;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; // we choose this IF we are guessing based on the class' import

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    //An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s ar
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;
    private String color;

    public Album(String title, String artist, int songCount, int length, String imageUrl, String color) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
        this.color = color;
    }
    public Album(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

package com.vijayetar.songr.models;

import com.vijayetar.songr.models.Album;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    public Album album;

    private String songTitle;
    private int songLength;
    private int trackNumber;

    public Song (){};

    public Song(String songTitle, int songLength, int trackNumber, Album album) {
        this.songTitle = songTitle;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId() {
        return id;
    }

    public Album getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongLength() {
        return songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}

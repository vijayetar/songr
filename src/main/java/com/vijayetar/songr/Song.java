package com.vijayetar.songr;

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
}

package com.vijayetar.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNull;

public class AlbumTest {
    //test instantiation
    @Test
    public void testAlbumAllGettersEmpty(){
        Album album = new Album();
        assertNull("Title", album.getTitle());
        assertNull("Artist", album.getArtist());
        assertEquals(0, album.getLength());
        assertEquals(0, album.getSongCount());
        assertNull("Image", album.getImageUrl());
    }
    // test all getters
    @Test
    public void testAlbumAllGettersWithInput(){
        Album album = new Album("Title","Artist",1,10,"Image");
        assertEquals("Title", album.getTitle());
        assertEquals("Artist", album.getArtist());
        assertEquals(1, album.getSongCount());
        assertEquals(10, album.getLength());
        assertEquals("Image", album.getImageUrl());
    }
    // test the setters
    @Test
    public void testAlbumAllSetters(){
        Album album = new Album();
        album.setTitle("NewTitle");
        assertEquals("NewTitle", album.getTitle());
        album.setArtist("NewArtist");
        assertEquals("NewArtist", album.getArtist());
        album.setImageUrl("NewImageUrl");
        assertEquals("NewImageUrl", album.getImageUrl());
        album.setSongCount(12);
        assertEquals(12, album.getSongCount());
        album.setLength(120);
        assertEquals(120, album.getLength());

    }
}


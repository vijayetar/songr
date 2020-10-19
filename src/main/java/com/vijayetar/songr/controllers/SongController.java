package com.vijayetar.songr.controllers;

import com.vijayetar.songr.models.Album;
import com.vijayetar.songr.models.AlbumRepository;
import com.vijayetar.songr.models.Song;
import com.vijayetar.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @PostMapping("/moresongs")
    public RedirectView addSongsToAlbum(String songTitle, int songLength, int trackNumber, Long albumId){
        System.out.println("here inside moresongs postmapping");
        Album currentAlbum = albumRepository.findById(albumId).get();
        Song newSong = new Song(songTitle, songLength, trackNumber, currentAlbum);
        currentAlbum.allSongs.add(newSong);
        albumRepository.save(currentAlbum);
        return new RedirectView("/albums");
    }

}

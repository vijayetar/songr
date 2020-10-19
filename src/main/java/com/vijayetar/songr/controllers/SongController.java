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
    @PostMapping("/update/song")
    public RedirectView updateSong(Long songId, String title, int length, int trackNumber){
        Song thisSong = songRepository.getOne(songId);
        thisSong.setSongTitle(title);
        thisSong.setSongLength(length);
        thisSong.setTrackNumber(trackNumber);
        songRepository.save(thisSong);
        return new RedirectView("/album/"+ thisSong.getAlbum().getId());
    }
    @PostMapping("/delete/song")
    public RedirectView deleteSong(Long songId, Long albumId){
        Song thisSong = songRepository.getOne(songId);
        songRepository.deleteById(songId);
        return new RedirectView("/album/"+ thisSong.getAlbum().getId());
    }

}

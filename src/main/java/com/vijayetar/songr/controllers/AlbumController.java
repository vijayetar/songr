package com.vijayetar.songr.controllers;

import com.vijayetar.songr.models.Album;
import com.vijayetar.songr.models.AlbumRepository;
import com.vijayetar.songr.models.Song;
import com.vijayetar.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepository;
    @Autowired
    public SongRepository songRepository;


    @PostMapping("/album") // app.post('/emotion')
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl, String color, String songTitle, int songLength, int trackNumber){
        System.out.println("here inside album post mapping");
        Album newAlbum = new Album ( title, artist, songCount, length, imageUrl, color);
        Song newSong = new Song(songTitle, songLength, trackNumber, newAlbum);
        newAlbum.allSongs.add(newSong);
        albumRepository.save(newAlbum);
        songRepository.save(newSong);
        return new RedirectView("/albums");
    }
    @GetMapping("/albums")
    public String showAlbums(Model m){
        ArrayList<Album> albums = (ArrayList<Album>)albumRepository.findAll();
        System.out.println("here are the albums "+albums.toString());
        m.addAttribute("albums", albums);
        return "albums";
    }
    @GetMapping("/album/{id}")
    public String showAlbumDetails(@PathVariable Long id, Model m){
        Album checkAlbum = albumRepository.getOne(id);
        m.addAttribute("albumInDetail", checkAlbum);
        return "details";
    }


}

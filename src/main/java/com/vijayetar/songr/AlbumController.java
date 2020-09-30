package com.vijayetar.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepository;

    @PostMapping("/album") // app.post('/emotion')
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl, String color){
        Album newAlbum = new Album ( title, artist, songCount, length, imageUrl, color);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
    @GetMapping("/albums")
    public String showAlbums(Model m){

        ArrayList<Album> albums = (ArrayList<Album>) albumRepository.findAll();

        m.addAttribute("albums", albums);
        return "albums";
    }
}

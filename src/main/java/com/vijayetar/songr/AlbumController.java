package com.vijayetar.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String displayAlbums(Model m){
        ArrayList<Album> allAlbums = new ArrayList<>();
        allAlbums.add(new Album("1", "1", 1, 1, "1"));
        allAlbums.add(new Album("2", "2", 2, 2, "2"));
        allAlbums.add(new Album("3", "3", 3, 3, "3"));
        m.addAttribute("allAlbums", allAlbums);
        return "albums";
    }
}

package com.vijayetar.songr;

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
    @PostMapping("/song")
    public RedirectView addSong(String songTitle, int songLength, int trackNumber, long albumId){
        Album albumFromRepo= albumRepository.getOne(albumId);
        Song song = new Song(songTitle, songLength, trackNumber, albumFromRepo);
        songRepository.save(song);
        return new RedirectView("/albums");
    }

}

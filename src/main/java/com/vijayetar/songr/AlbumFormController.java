package com.vijayetar.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumFormController {
        @RequestMapping(value = "/saveAlbum", method = RequestMethod.POST)
        public void saveAlbum(@ModelAttribute Album album, BindingResult errors, Model model){
            System.out.println(album);
        }
}

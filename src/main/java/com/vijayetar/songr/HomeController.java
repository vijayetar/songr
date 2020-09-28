package com.vijayetar.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/capitalize/{message}")
    public String capitalize(Model m, @PathVariable String message){
        m.addAttribute("message", message.toUpperCase());
        return "capitalize";
    }




}

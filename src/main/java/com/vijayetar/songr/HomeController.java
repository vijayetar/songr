package com.vijayetar.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    @GetMapping("/hello")
    public String sayHello(Model m, String name){
        m.addAttribute("name", name);
        return "hello";
    }
    @GetMapping("/capitalize/{message}")
    public String capitalize(Model m, @PathVariable String message){
        m.addAttribute("message", message.toUpperCase());
        return "capitalize";
    }
//    @RequestMapping(value = "/hello/name", method = RequestMethod.GET)
//    @ResponseBody
//    public String getNameBySimplePath() {
//        return "hello";
//    }

}

package com.vijayetar.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class NumberController {
    @GetMapping("/numbers")
    public String getNumberReference(Model m,Integer num) throws IOException {
        String urlString = "http://numbersapi.com/" + num;
        System.out.println("this is urlString"+urlString);
        URL url = new URL(urlString);
        HttpURLConnection connection;
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String oneLine = input.readLine();
        System.out.println("this is oneline"+oneLine);
        m.addAttribute("oneLine",oneLine);
        return "numbers";
    }
}

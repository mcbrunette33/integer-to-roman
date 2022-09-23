package com.mikebrunetteinttoroman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @GetMapping("/")
public String getHome(){
        return "index";
    }
    @PostMapping("/convertRoman")
    public RedirectView convertInts(int converter){
        return new RedirectView("/romanDisplay/" + converter);
    }
}

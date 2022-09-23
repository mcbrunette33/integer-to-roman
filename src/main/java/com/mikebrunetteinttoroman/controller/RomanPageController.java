package com.mikebrunetteinttoroman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.mikebrunetteinttoroman.service.ConvertService;

@Controller
public class RomanPageController {
    @Autowired
    ConvertService convertService;
    @GetMapping("/romanDisplay/{converter}")
    public String getRomanPage(Model mdl, @PathVariable int converter){
        String toRoman = convertService.intToRoman(converter);
        mdl.addAttribute("Roman", toRoman);
        return "romanDisplay";
    }
}

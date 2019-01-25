package com.aeropuerto.adminfull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/404.html")
    public String render404(){
        return "404";
    }
}

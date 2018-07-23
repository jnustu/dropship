package com.jnu.dropship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jnu")
public class controller {

    @GetMapping
    public String getIndex(){
        return "index";
    }

    @GetMapping("login0")
    public String getLogin(){
        return "login";
    }


}

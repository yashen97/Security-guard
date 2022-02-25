package com.example.securitypatchme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Home {

    @GetMapping("/")
    public String home(){
        return ("<h1>welcome home</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>welcome admin</h1>");
    }
}

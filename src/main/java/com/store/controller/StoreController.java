package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
    
    @GetMapping("/catalog")
    public String catalog() {
        return "catalog";
    }
}
package com.example.storeapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotepadController {
    
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    
    @GetMapping("*")
    public String getDefault() {
        return "redirect:/";
    }
}
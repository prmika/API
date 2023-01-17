package com.example.SecondApi;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeroController {
    
    @GetMapping("/heroes")
    public String getHeroes(Model model){
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Aragon");
        heroes.add("Galadriel");
        heroes.add("Kulli");
        model.addAttribute("heroes", heroes);
        return "heroes";
    }
   /* @PostMapping("/heroes")
    public String addhero(@RequestParam String heroName){
        
    }*/
}
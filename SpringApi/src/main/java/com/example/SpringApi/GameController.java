
package com.example.SpringApi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
    
    @GetMapping
    
    public String getIndex() {
        return "index";
    }
    @GetMapping("*")
    public String getDefault() {
        return "redicted:/";
    }
            
}


package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class MainController {
    @Autowired
    private MonsterService monsterService;
    @Autowired
    private ListMapService listMapService;
    
    @GetMapping("/")
    @ResponseBody
    public String greet() {
        System.out.println("greet");//printataan aina jotain
        return "Greetings from server!";
    }
    
    
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        System.out.println("sayinghello");//printataan aina jotain
        return "Hello stranger!";
    }
    
   //localhost:8080/helloname?name=Miika
    @GetMapping("/helloname")
    @ResponseBody
    public String sayHelloWithName(@RequestParam String name) {
        System.out.println("saying hello to " + name);//printataan aina jotain
        return "Hello " + name + "!";
    }
    @GetMapping("/list")
    @ResponseBody
    public ArrayList<String> getList() {
        System.out.println("Palautetaan lista...");
        return listMapService.getList();
    }
    
    @GetMapping("/map")
    @ResponseBody
    public HashMap<String, String> getMap() {
        System.out.println("Palautetaan map...");
        return listMapService.getMap();
    }
    
    @GetMapping("/monster")
    @ResponseBody
    public Monster getMonster() {
        System.out.println("Palautetaan monster...");
        Monster monster = monsterService.getNewMonster();
        return monster;
    }
    
    @PostMapping("/monster")
    @ResponseBody
    public Monster createMonster(@RequestBody Monster m) {
        System.out.println(m.getName() + " " + m.getAge() + " " + m.isScary());
        return m;
    }
}

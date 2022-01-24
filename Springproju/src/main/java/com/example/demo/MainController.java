
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class MainController {
    
    
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
    @GetMapping("/hello/{name}")
    @ResponseBody
    //http://localhost:8080/hello/Miika
    public String sayHelloWithPath(@PathVariable String name) {
        System.out.println("saying hello to " + name);//printataan aina jotain
        return "Hello " + name + "!";
    }
}

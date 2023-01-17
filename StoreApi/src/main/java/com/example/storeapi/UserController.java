package com.example.storeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/join")
    public String getJoin() {
        return "join";
    }

    @GetMapping ("/users")
    public String getUsers(Model model){
        ArrayList<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @PostMapping("/join")
    public String addUser(@RequestParam String userName, String userPassword, Model model, RedirectAttributes redirAttrs){
       User user = userService.addUser(userName, userPassword);
       if (user == null) {
           return "redirect:/index";
       }
        System.out.println("käyttäjä on jo käytössä");
        redirAttrs.addFlashAttribute("error", "Käyttäjä on jo käytössä");
       return "redirect:/join";
    }
    @GetMapping ("/login")
    public String getUser(@RequestParam String userName, String userPassword, Model model){
        User user = userService.findUser(userName, userPassword);
        model.addAttribute("user", user);
        if (user == null){
            System.out.println("kirjautumien epäonnistui");
            return "/login";
        }
        System.out.println("kirjautuminen onnistui"+ user);

        return "redirect:/";
    }




}

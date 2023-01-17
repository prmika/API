package com.example.storeapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;




    @GetMapping ("/stores")
    public String getStores(Model model) {
        ArrayList<Store> stores = storeService.getStores();
        model.addAttribute("stores", stores);
        return "stores";
    }
    @PostMapping("/stores")
    public String addStore(@RequestParam String storeName, String storeLocation) {
        System.out.println("Saatiin: " + storeName + storeLocation);
        storeService.addStore(storeName, storeLocation);
        return "redirect:/stores";
    }
    @GetMapping("stores/{storeName}")
    public String getStoreInfo(@PathVariable String storeName, Model model) {
        Store store = storeService.findStoreByName(storeName);
        model.addAttribute("store", store);
        return "store";
    }
    @PostMapping("/deletestore")
    public String deleteStore(@RequestParam String storeName) {
        storeService.deleteStore(storeName);
        return "redirect:/stores";
    }
}

package com.example.storeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class StoreService {
    //private ArrayList<Store> stores;

   @Autowired
   private StoreRepository storeRepository;


    public ArrayList<Store> getStores() {

        return this.storeRepository.findAll();
    }

    public void addStore(String name, String location) {
        this.storeRepository.save(new Store(name, location));
        System.out.println("added " + name + " store");
    }

    public Store findStoreByName(String storeName) {
        return this.storeRepository.findByName(storeName).get(0);
    }
    @Transactional
    public void deleteStore(String name) {
        this.storeRepository.deleteByName(name);
        System.out.println("deleted " + name + " store");
    }
}

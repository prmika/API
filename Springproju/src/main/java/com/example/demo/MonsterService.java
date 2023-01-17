package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MonsterService {
    public Monster getNewMonster() {
        System.out.println("Monster Service");
        Monster monster = new Monster("Mörkö", 200, true);
        return monster;
    }
}

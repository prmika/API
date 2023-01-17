package com.example.storeapi;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User("admin", "password"));
    }
    public ArrayList<User> getUsers() {

        return users;
    }

    public User addUser(String name, String password) {
        for (User user : users)
            if (user.getName().equals(name)) {
                return user;
            }
        this.users.add(new User(name,password));
        System.out.println("added " + name);
        return null;
    }

    public User findUser(String userName, String userPassword) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                if (user.getPassword().equals(userPassword)) {
                    return user;
                }
            }
        }
        return null;
    }

}

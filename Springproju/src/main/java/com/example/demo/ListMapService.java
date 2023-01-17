
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
        
 class ListMapService {
    public ArrayList<String> getList() {
        System.out.println("List Service");
        ArrayList<String> list = new ArrayList<>();
        list.add("moi");
        list.add("hei");
        list.add("terve");
        return list;
    }
    
    public HashMap<String, String> getMap() {
        System.out.println("Map Service");
        HashMap<String, String> map = new HashMap<>();
        map.put("Helsinki", "Finland");
        map.put("Berlin", "Germany");
        map.put("Buenos Aires", "Argentina");
        return map;
    }
}

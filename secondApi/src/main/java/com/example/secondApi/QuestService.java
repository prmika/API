
package com.example.secondApi;

import java.util.ArrayList;
import org.springframework.stereotype.Service;


@Service

public class QuestService {
    
        private ArrayList<Quest> quests;
        
        public QuestService() {
            System.out.println("Luodaan questit...");
            this.quests = new ArrayList<>();
            this.quests.add(new Quest("Steal sauro's monokkeli", 12));
            
        }
}


package com.example.secondApi;



import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Quest {
    private String jotain;
    private int taso;

    public Quest(String jotain, int taso) {
        this.jotain = jotain;
        this.taso = taso;
    }
    
}

package com.mycompany.javaexamples;

import java.util.ArrayList;

/**
 *
 * @author maipp
 */
public class Main {
    public static void main(String[] args){
            System.out.println("Hello world!");
           /* System.out.println("sout ja tab-> tulee System.out.println automaattisesti.");
            System.err.println("serr ja tab-> tulle System.err.println autom");
            
            int x = 3;//integer
            double y = 0.3;//double
            boolean z = true;//booleani
            char a = 't';
            String text = "tämä on esimerkki teksti";
            
            System.out.println(text);
            System.out.println("Tekstin pituus on: " + text.length());
            System.out.println("Tekstin ensimmäinen kirjain: " + text.charAt(0));
            System.out.println("Int x on: " + x);
            
            System.out.println("x + y on: "+ (y+x));
            int UserInput = Integer.parseInt("333");
            String word = Integer.toString(3);
            //if lause
            if (text.charAt(0)== 'a'){
                System.out.println("lol");
            }
            //else if
            else if (text.charAt(2)== 'm'){
                        System.out.println("tämä on char " + a);
            }
            else if(a != 'a'){
                System.out.println("onnistui");
            }
            //for loop
            for (int i = 0; i < 10; i++){
                System.out.println(i);
            }
            //while loop
            int j = 0;
            while (j < 10 ){
                System.out.println(j);
            j++;
            }
            
            // 2 ways to make a array
            int[] values = new int[3]; // 0, 0, 0,
            int[] values2 = { 2, 55, 66, -10}; 
            values[1] = 10;
            
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
            }
            
            for (int number : values2){
                System.out.println(number);
            }
       
            int[][] values3 = new int[30][60];
           
            System.out.println(values3[1][31]);
          
            ArrayList<String> words = new ArrayList<>();
           words.add("moi!");
           words.add("tämä on viisas lista");
         */  
          /* helloWorld("tekstijono");
           
           int[] Numbers = {1, 4, 2, -4};
           double average = average(Numbers);
           System.out.println(average);

           System.out.println(MyMath.randomInteger(1,6));
  
           ArrayList<String> words = new ArrayList();
           System.out.println(longest());
    }

    public static void helloWorld(String mJono) {
        System.out.println("Hello world!");
        int x=0;
       for (int i= 0; i < mJono.length(); i++){
            System.out.println(mJono.charAt(i));
        }
        
    }

    public static double average(int[] array) {
double sum = 0;

for (int x : array ){
    sum += x;
    }
    
    double average = sum / array.length;
        return average;
    }
*/
    /*public static String longestWord(ArrayList<String> words) {
        if (word.lenght()>longest.length()){
            longest = word;
        }*/
        
    Dog doggy1 = new Dog("Rex");
    doggy1.setName("Musti");
    doggy1.play();
    Dog doggy2 = new Dog("Doggy", 5);
    doggy1.play(doggy2);
    
    }

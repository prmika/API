/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexamples;

/**
 *
 * @author maipp
 */
public class MyMath {
    public static int randomInteger(int min, int max){
        int options = max - min +1;
        int randomInt = (int) (Math.random() * options) + min;
   
        return randomInt;
    }
    
}

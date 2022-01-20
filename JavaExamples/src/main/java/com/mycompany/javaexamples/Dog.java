
package com.mycompany.javaexamples;



public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void play() {
        System.out.println(this.name + " is playing!");
    }
    public void play() {
        System.out.println(this.name + " is playing with " + friend.getName() + "!");
    }
}

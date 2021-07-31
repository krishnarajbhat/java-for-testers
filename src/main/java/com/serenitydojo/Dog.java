package com.serenitydojo;

public class Dog extends Pet{
   // private String name;
    private String favToy;
    private int age;

    public Dog(String name,String favToy, int age){
    super(name);
    this.favToy = favToy;
    this.age = age;
    }

    /*public String getName() {
        return name;
    }*/

    public String getFavoriteToy() {
        return favToy;
    }

    public int getAge() {
        return age;
    }
}

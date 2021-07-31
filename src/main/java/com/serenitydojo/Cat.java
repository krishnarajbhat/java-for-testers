package com.serenitydojo;

public class Cat extends Pet {
    private int age;
    private String food;
  //  private String name;

    public Cat(String name,String food, int age) {
        super(name);
        this.food = food;
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }
}

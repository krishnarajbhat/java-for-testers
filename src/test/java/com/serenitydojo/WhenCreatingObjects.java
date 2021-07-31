package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

        Cat felix = new Cat("Felix", "Tuna", 6);
        Assert.assertEquals(felix.getName(),"Felix");
        Assert.assertEquals(felix.getFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 6);

        Pet hamster = new Pet("Rusty");

    }

    @Test
    public void working_with_Hamster(){
        Hamster hamster = new Hamster("Rocky", "Hamster Race");
        System.out.println(hamster.getGame()) ;
    }
}

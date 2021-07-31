package com.serenitydojo;

public class Hamster extends Pet{
    private String game;

    public Hamster(String name, String game) {
        super(name);
        this.game = game;

    }

    public String getGame() {
        return getName()+" likes to play "+game;
    }
}

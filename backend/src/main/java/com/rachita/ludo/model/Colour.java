package com.rachita.ludo.model;

public enum Colour {
    BLUE(1, "blue"),
    RED(2, "red"),
    YELLOW(3, "yellow"),
    GREEN(4, "green");

    private final int id;
    private final String name;

    Colour(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


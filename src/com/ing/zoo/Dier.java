package com.ing.zoo;

public abstract class Dier {
    String name;

    public Dier(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public String getName() {
        return name;
    }
}

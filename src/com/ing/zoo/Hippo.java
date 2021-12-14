package com.ing.zoo;

public class Hippo extends Dier implements Herbivor {

    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    public void sayHello() {
        helloText = "splashhhhhh";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}

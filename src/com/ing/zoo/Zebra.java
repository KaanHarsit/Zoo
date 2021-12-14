package com.ing.zoo;

import java.util.Random;

public class Zebra extends Dier implements Herbivor {

    public String helloText;
    public String eatText;

    public Zebra(String name) {
        super(name);
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

}

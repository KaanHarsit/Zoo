package com.ing.zoo;

import java.util.Random;

public class Panda extends Dier implements Herbivor, canDoTrick {

    public String helloText;
    public String eatText;
    public String trick;

    public Panda(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "fluuttt prr p-p-p-paaannddda";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "homhomhom pr hom yum";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "makes a salto";
        }
        else
        {
            trick = "stands on its feet";
        }
        System.out.println(trick);
    }
}

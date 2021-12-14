package com.ing.zoo;

import java.util.Random;

public class Cat extends Dier implements Carnivor, canDoTrick  {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Cat(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "miauw miauw";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "njomnjomnjom njom njom thx grr";
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

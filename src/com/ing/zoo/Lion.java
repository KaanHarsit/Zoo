package com.ing.zoo;

public class Lion extends Dier implements Carnivor {
    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }



}

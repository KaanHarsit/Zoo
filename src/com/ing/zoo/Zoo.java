package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        //Commands aanmaken
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //Toevoegen van de dieren
        Lion henk = new Lion(" henk");
        Hippo elsa = new Hippo(" elsa");
        Pig dora = new Pig(" dora");
        Tiger wally = new Tiger(" wally");
        Zebra marty = new Zebra(" marty");
        Cat foxy = new Cat(" foxy");
        Panda chally = new Panda(" chally");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        //Toevoegen van de dieren in een dierenlijst
        ArrayList<Dier> dierenlijst = new ArrayList<>();
        dierenlijst.add(henk);
        dierenlijst.add(elsa);
        dierenlijst.add(dora);
        dierenlijst.add(wally);
        dierenlijst.add(marty);
        dierenlijst.add(foxy);
        dierenlijst.add(chally);

        int aantal = 0;

        // Uitvoeren van de commands
        for (Dier dieren : dierenlijst
        ) {
            if (input.equals(commands[0])) {
                dieren.sayHello();
            } else if (input.equals(commands[0] + dieren.getName())) {
                dieren.sayHello();
            } else if (input.equals(commands[1])) {
                if (dieren instanceof Herbivor) {
                    ((Herbivor) dieren).eatLeaves();
                }
            } else if (input.equals(commands[2])) {
                if (dieren instanceof Carnivor) {
                    ((Carnivor) dieren).eatMeat();
                }
            } else if (input.equals(commands[3])) {
                if (dieren instanceof canDoTrick) {
                    ((canDoTrick) dieren).performTrick();
                }
            } else {
                aantal++;
            }
        }

        if (aantal == dierenlijst.size()) {
            System.out.println("Unknown command: " + input);
        }
    }

}

package org.example;

import java.util.Scanner;

public class Ejercicio_6 {
    public void ejercicio_6() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Tenemos tomate?");
        String tomate = entrada.next();
        if (tomate.equals("no")) {
            System.out.println("Tenemos que ir a comprar");
        }
        else {
            System.out.println("!No tenemos que ir a comprar¡");
        }

        System.out.println("¿Tenemos aceite?");
        String aceite = entrada.next();
        if (aceite.equals("no")) {
            System.out.println("Tenemos que ir a comprar");
        }
        else {
            System.out.println("!No tenemos que ir a comprar¡");
        }

        System.out.println("¿Tenemos jamon?");
        String jamon = entrada.next();
        if (jamon.equals("no")) {
            System.out.println("Tenemos que ir a comprar");
        }
        else {
            System.out.println("!No tenemos que ir a comprar¡");
        }

    }
}
package org.example;

import java.util.Scanner;

public class Ejercicio_3 {
    public void ejercicio_3() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime el primer divisor ");
        int num1 = entrada.nextInt();

        System.out.println("Dime el segundo divisor");
        int num2 = entrada.nextInt();

        if (num2 == 0) {
            System.out.println("ERROR, no se puede dividir entre 0");
        }
        else {
            int division = num1 / num2;

            System.out.println("EL resultado de la divison es: " + division);
        }
    }
}

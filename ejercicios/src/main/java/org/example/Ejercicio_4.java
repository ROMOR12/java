package org.example;

import java.util.Scanner;

public class Ejercicio_4 {
    public void ejercicio_4() {
        Scanner entrada = new Scanner(System.in);

        int base = 0;
        int altura = 0;

        while (base == 0 ) {
            System.out.println("Valor de la  base: ");
            base = entrada.nextInt();

            if (base == 0) {
                System.out.println("El valor de la base tiene que ser mayor que 0");
            }

        }

        while (altura == 0) {
            System.out.println("valor de la altura: ");
            altura = entrada.nextInt();

            if (altura == 0) {
                System.out.println("El valor de la altura tiene que ser mayor que 0");
            }

        }
        int area = (base * altura) / 2;

        System.out.println("El area del triangulo es " +area);
    }
}

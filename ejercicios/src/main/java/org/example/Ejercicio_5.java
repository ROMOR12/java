package org.example;

import java.util.Scanner;

public class Ejercicio_5 {
    public void  ejercicio_5() {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        while (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Introduce el primer numero: ");
            num1 = entrada.nextInt();

            System.out.println("Introduce el segundo numero: ");
            num2 = entrada.nextInt();

            if (num1 != num2) {
                System.out.println("Introduce el tercer numero: ");
                num3 = entrada.nextInt();
                if (num1 == num3) {
                    System.out.println("ERROR, NO pueden haber dos numeros iguales");
                }
                else if (num2 == num3) {
                    System.out.println("ERROR, NO pueden haber dos numeros iguales");
                }
                else {
                    System.out.println(num1 + " " + num2 + " " + num3 + " Son diferentes" );
                }
            }
            else {
                System.out.println("ERROR, NO pueden haber dos numeros iguales");
            }
        }

    }
}

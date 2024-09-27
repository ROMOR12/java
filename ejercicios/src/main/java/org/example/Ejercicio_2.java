package org.example;

import java.util.Scanner;

public class Ejercicio_2 {
    public void ejercicio_2 (){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " Es mas grande que " + num2);
        }
        else if (num1 < num2 ){
            System.out.println(num2 + " Es mas grande que " + num1);
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}

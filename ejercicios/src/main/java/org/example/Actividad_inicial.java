package org.example;

import java.util.Scanner;

public class Actividad_inicial {
    public void ejecutar() {
        System.out.println("Hello and welcome!");

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

         int num1 = 0;
         int num2 = 0;

        while (num1 == 0 || num2 == 0) {
            System.out.println("Introduce un numero");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro numero");
            num2 = entrada.nextInt();

            if (num1 == 0 || num2 == 0){
                System.out.println("Los numeros tienen que ser mayor que 0 ");
            }
            else{
                int total = num1 + num2;
                System.out.println("El resultado de sumar los dos numeros es: " + total);
            }


        }
    }
}

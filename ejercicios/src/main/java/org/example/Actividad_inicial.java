package org.example;

import java.util.Scanner;

public class Actividad_inicial {
    public static <string, Int> void main(String[] args) {
        System.out.println("Hello and welcome!");

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = entrada.nextInt();

        int total = num1 + num2;
        System.out.println("El resultado de sumar los dos numeros es: " + total);
    }
}

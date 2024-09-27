package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica_3 {
    public void practica_3() {
        // Creamos un objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);

        // Declaramos una variable a 0 que usaremos mas adelante para calcular la edad faltante de la persona
        int edad_faltante = 0;

        // Declaramos una variable tipo String para saber el nombre de la persona
        System.out.println("¿Como te llamas?");
        String nombre = entrada.next();

        // Declaramos una variable tipo int para saber la edad de la persona
        int edad = 0;

        // Declaramos una variable de tipo boolean para controlar cuando se va a salir delsiguiente bucle
        boolean condicion = true;

        /* Hacemos un bucle para que cuando introduzcamos una letra en la edad de un error y nos lo vuelva
        a preguntar */
        while (condicion == true) {
            try {
                System.out.println("Hola " + nombre + " Introduce su edad");
                edad = entrada.nextInt();

                /* Comprovamos que la edad sea mayor que 0, para asi que nosdiga que no se pueden poner
                numeros negativos */
                if (edad < 0) {
                    System.out.println("ERROR. El valor de tu edad tiene que ser un numero positivo");
                }
                else {

                    // Condicion se pone en falso, con lo cual salimos del bucle
                    condicion = false;
                }
            }

            // en caso de haber introducido un valor que no sea numerico nos dira que la edad tiene que tener un valor
            // numerico
            catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR. El valor de tu edad tiene que ser numerica");
                entrada.next();
            }
        }

        // Hacemos una condiciendo que mientras la persona tenga menos de 18 años le diga que no puede votar
        if (edad < 18) {
            System.out.println("Lo siento " + nombre + " no puedes votar");

            /* creamos un bucle para calcular la edad faltante de la persona, cada vez que el bucle se complete este
            sumara 1 a la edad faltante para cualcular cuento le falta para llegar a 18 y tambien se sumara 1 a la
            edad para que cuadno llegue a 18 el bucle se detenga */
            while (edad < 18) {
                edad++;
                edad_faltante++;
            }

            // Imprimimos la edad faltante de la persona
            System.out.println("Te faltan " + edad_faltante + " años para ser mayor de edad");
        }

        // En caso de que la edad sea mayor que 18 nos dira que si que podemos votar
        else {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        }
    }
}

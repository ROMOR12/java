package org.example;

import java.util.Scanner;

public class Ejercicio_1 {
    public void ejercicio_1 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero para saber si es mayor o menor que 0: ");
        int num = entrada.nextInt();

        if (num > 0){
            System.out.println("El numero introducido es mayor que 0");
        }
        else if (num == 0){
            System.out.println("El numero introducido es 0");
        }
        else {
            System.out.println("El numero introducido es menor o igual que 0");
        }

    }
}

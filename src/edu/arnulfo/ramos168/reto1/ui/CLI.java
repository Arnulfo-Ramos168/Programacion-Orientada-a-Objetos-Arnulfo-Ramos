package edu.arnulfo.ramos168.reto1.ui;

import edu.arnulfo.ramos168.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){
        System.out.println("Elige una opción");
        System.out.println("(1) suma");
        System.out.println("(2) resta");
        System.out.println("(3) multi");
        System.out.println("(4) divi");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();scanner.nextLine();

        System.out.println("introduce el primer valor");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("Introduce el segundo valor");
        int operando2 =scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion = "";
        switch (option){
            case 1:
                Calculadora.sumarNumeros(operando1, operando2);
                resultado = Calculadora.sumarNumeros(operando1, operando2);
                break;

        }
        System.out.printf("El resultado de la operacion de %d + %d = %d ", operando1, operando2, resultado);


    }
}
package br.com.alura.horadapratica.exception;

import java.util.Scanner;

public class MainDivisao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int number1 = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int number2 = sc.nextInt();

        try {
            double resultado = number1 / number2;
            System.out.println("\nResultado: " + resultado);

        } catch (Exception e) {
            System.out.println("\nErro, divisão com 0 é PROIBIDO!");
        }

    }
}

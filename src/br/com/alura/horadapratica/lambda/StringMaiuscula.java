package br.com.alura.horadapratica.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Maiuscula {
    String transformar(String t);
}

public class StringMaiuscula {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Maiuscula toUpperCase = String::toUpperCase;
        System.out.print("Texto: ");
        String texto = sc.nextLine();

        System.out.println(toUpperCase.transformar(texto));
        sc.close();
    }
}

package br.com.alura.horadapratica.lambda;

import java.util.Scanner;

@FunctionalInterface
interface IPalindromo {
    boolean verificarPalindromo(String str);
}

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IPalindromo palindromo = texto -> {
            String textoInvertido = new StringBuilder(texto).reverse().toString();
            return texto.equalsIgnoreCase(textoInvertido);
        };
        System.out.print("Texto: ");
        String textoStr = sc.nextLine().replace(" ", "");
        System.out.println(palindromo.verificarPalindromo(textoStr));
        sc.close();
    }
}

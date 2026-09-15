package br.com.alura.horadapratica.lambda;

import java.util.Arrays;
import java.util.List;

public class OrdemAlfabética {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Paulo", "Theo", "Ana", "Zico", "Bruno", "Remo");

        System.out.println("Antes de ordenar: " + nomes);
        nomes.sort(String::compareTo);
        System.out.println("Depois de ordenar: " + nomes);
    }
}

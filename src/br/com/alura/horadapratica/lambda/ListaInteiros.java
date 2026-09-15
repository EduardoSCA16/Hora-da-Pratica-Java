package br.com.alura.horadapratica.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface IInteiros {
    List<Integer> multiplicar(List<Integer> lista);
}

public class ListaInteiros {
    static void main(String[] args) {
        List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IInteiros inteiros = lista -> {
            lista.replaceAll(n -> n * 3);
            return lista;
        };

        System.out.println("Lista normal: " + listaInteiros);
        System.out.println("Multiplicado por 3: " + inteiros.multiplicar(listaInteiros));
    }
}

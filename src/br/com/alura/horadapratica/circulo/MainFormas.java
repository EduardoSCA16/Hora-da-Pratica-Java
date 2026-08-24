package br.com.alura.horadapratica.circulo;

import java.util.ArrayList;

public class MainFormas {
    static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();

        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma item : listaFormas) {
            System.out.println("Área: " + item.calcularArea());
        }

    }
}

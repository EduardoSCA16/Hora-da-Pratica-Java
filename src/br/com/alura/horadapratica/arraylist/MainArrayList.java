package br.com.alura.horadapratica.arraylist;

import br.com.alura.horadapratica.animal.Animal;

import java.util.ArrayList;

public class MainArrayList {
    static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Olá");
        lista.add("Mundo!");
        lista.add("Eduardo");
        lista.add("Java");
        lista.add("Python");

        for (String item : lista) {
            System.out.println(item);
        }
    }
}

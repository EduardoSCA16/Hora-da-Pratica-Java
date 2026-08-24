package br.com.alura.horadapratica.collections;

import br.com.alura.horadapratica.collections.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainCollections {
    static void main(String[] args) {
        List<String> listaString = new ArrayList<>(
                List.of("Olá Mundo!", "Dissertamente", "HeadSet", "iPhone 16", "Estágio")
        );

        System.out.println("Lista antes de ser ordenada:");
        System.out.println(listaString);
        Collections.sort(listaString);
        System.out.println("Lista depois de ser ordenada:");
        System.out.println(listaString);

        // ----------------------------------------
        Titulo t1 = new Titulo("Título1");
        Titulo t2 = new Titulo("Título2");
        Titulo t3 = new Titulo("Título3");
        Titulo t4 = new Titulo("Título4");
        Titulo t5 = new Titulo("Título5");
        Titulo t6 = new Titulo("Título6");
        Titulo t7 = new Titulo("Título7");

        List<Titulo> listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add(t1);
        listaPolimorfica.add(t2);
        listaPolimorfica.add(t3);
        listaPolimorfica.add(t4);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add(t5);
        listaPolimorfica.add(t6);
        listaPolimorfica.add(t7);

        Collections.sort(listaPolimorfica);

        for (Titulo item : listaPolimorfica) {
            System.out.println(item.getNome());
        }

    }
}

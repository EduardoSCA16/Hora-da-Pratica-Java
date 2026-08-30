package br.com.alura.horadapratica.arquivos.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTitulo {
    static void main(String[] args) {
        Titulo titulo1 = new Titulo("Dog Ville", 2005, 2);
        Titulo titulo2 = new Titulo("Shrek", 2001, 3);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        List<Titulo> titulos = new ArrayList<>();

        titulos.add(titulo1);
        titulos.add(titulo2);

        try (FileWriter writer = new FileWriter("tituloFilme.txt")) {
            writer.write(gson.toJson(titulos));
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());;
        }

    }
}

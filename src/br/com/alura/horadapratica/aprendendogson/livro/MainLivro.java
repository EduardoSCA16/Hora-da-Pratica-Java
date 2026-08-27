package br.com.alura.horadapratica.aprendendogson.livro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}

public class MainLivro {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Livro livroGson = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livroGson);
    }
}

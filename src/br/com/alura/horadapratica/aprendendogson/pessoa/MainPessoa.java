package br.com.alura.horadapratica.aprendendogson.pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Aprendendo a usar o Gson para poder tratar dados
// Transformar arquivo JSON em um objeto Java

public class MainPessoa {
    static void main(String[] args) {

        // Exercício 1
//        String json = """
//            {
//                "Nome": "Eduardo",
//                "Idade": 20,
//                "Cidade": "Goiânia"
//            }
//            """;

//        Gson gson = new Gson();
//        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
//
//        System.out.println("Objeto pessoa: " + pessoa);

        // Exercício 2
        String json = """
            {
                "Nome": "Eduardo",
                "Cidade": "Goiânia"
            }
            """;

        Gson gson = new GsonBuilder()
                .setLenient() // Define se as análises de dados devem ser tolerantes ou estrita ao encontrar erros ou formatos incorretos
                .create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}

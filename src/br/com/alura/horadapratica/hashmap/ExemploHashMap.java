package br.com.alura.horadapratica.hashmap;

import java.util.HashMap;
import java.util.Map;

// HashMap -> guarda pares CHAVE → VALOR
//
// put() -> adiciona/atualiza um par
//
// get() -> pega o valor através da chave
//
// remove() -> remove o par através da chave
//
// keySet() -> pega todas as chaves


public class ExemploHashMap {
    public static void main(String[] args) {
        // Criando um objeto da Classe HashMap que implementa a interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros é: " + valor);

        // Removendo um chave-valor
        usandoHashMap.remove("Gatos");

        // Iterando sobre as chaves
        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }

    }
}

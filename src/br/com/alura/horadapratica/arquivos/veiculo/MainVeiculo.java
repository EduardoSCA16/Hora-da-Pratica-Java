package br.com.alura.horadapratica.arquivos.veiculo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    static void main(String[] args) {

        // Criando os objetos Record primeiro
        VeiculoRecord record1 = new VeiculoRecord("Argo", "Fiat", "Flex");
        VeiculoRecord record2 = new VeiculoRecord("Polo Track", "Volkswagen", "Gasolina");

        // Depois criando os objetos da classe Veiculo
        Veiculo carro1 = new Veiculo(record1);
        Veiculo carro2 = new Veiculo(record2);

        // Adiciona os objetos da classe Veiculo na lista
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(carro2);

        // Salva a lista veiculos em formato JSON
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        try (FileWriter writer = new FileWriter("veiculos.txt")) {
            writer.write(gson.toJson(veiculos));
            System.out.println("Arquivo gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}

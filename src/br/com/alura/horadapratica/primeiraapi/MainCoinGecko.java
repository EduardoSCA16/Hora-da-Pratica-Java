package br.com.alura.horadapratica.primeiraapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCoinGecko {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome da Cripto Moeda: ");
        String criptoNome = sc.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=" + criptoNome;

        // Criando o client
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

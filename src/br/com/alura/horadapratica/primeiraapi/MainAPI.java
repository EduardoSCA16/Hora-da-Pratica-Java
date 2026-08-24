package br.com.alura.horadapratica.primeiraapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o título de um livro:");
        var titulo = sc.nextLine().replace(" ", "+");

        // Inserindo a API Key de maneira segura
        String chaveAPI = System.getenv("GOOGLE_BOOKS_API_KEY");
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=" + chaveAPI;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

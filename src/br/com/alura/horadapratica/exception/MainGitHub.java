package br.com.alura.horadapratica.exception;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainGitHub {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o username: ");
        String username = sc.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    // Define no cabeçalho HTTP que a requisição espera receber a resposta na versão 3 da API do GitHub em formato JSON
                    // "Accpet" indica qual formato de dados o código aceita como resposta
                    // .header() é o metodo da classe HttpRequest.Builder
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

            String json = response.body();
            System.out.println(json);

        // Captura erros de rede ou interrupções que possam acontecer durante a chamada à API do GitHub
        // IOException: Trata erros de conexão de rede
        // InterruptedException: Trata o cancelamento da requisição caso a execução do programa seja interrompida enquanto esperava resposta
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nPrograma encerrado corretamente.");

    }
}

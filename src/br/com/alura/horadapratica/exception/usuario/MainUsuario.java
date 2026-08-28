package br.com.alura.horadapratica.exception.usuario;

import java.util.Scanner;

public class MainUsuario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("Senha inválida. Mínimo 8 caracteres.");
            }
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());;
        }

        System.out.println("Programa encerrado com sucesso!");
    }
}

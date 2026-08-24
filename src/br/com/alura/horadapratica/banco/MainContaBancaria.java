package br.com.alura.horadapratica.banco;

import java.util.ArrayList;
import java.util.List;

public class MainContaBancaria {
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1232, 5000);
        ContaBancaria conta2 = new ContaBancaria(4321, 65);
        ContaBancaria conta3 = new ContaBancaria(5555, 412324);
        ContaBancaria conta4 = new ContaBancaria(4932, 2804);
        ContaBancaria conta5 = new ContaBancaria(8902, 1800);
        ContaBancaria conta6 = new ContaBancaria(1503, 2561);
        ContaBancaria conta7 = new ContaBancaria(9999, 65342);

        // List.of() coloca vários objetos dentro de uma lista
        ArrayList<ContaBancaria> listaContas = new ArrayList<>(
                List.of(conta1, conta2, conta3, conta4, conta5, conta6, conta7)
        );

        ContaBancaria contaMaiorSaldo = listaContas.getFirst();

        for (ContaBancaria item : listaContas) {
            if (contaMaiorSaldo.getSaldo() < item.getSaldo()) {
                contaMaiorSaldo = item;
            }
        }

        System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroConta());
        System.out.printf(String.format("Saldo: R$%.2f", contaMaiorSaldo.getSaldo()));
    }
}

package br.com.alura.horadapratica.carro.models;

public class Carro {
    private String nomeModelo;
    private double preco1;
    private double preco2;
    private double preco3;

    //Getters e Setters

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    // Methods

    public void exibirInfo() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preço ano 1: " + preco1);
        System.out.println("Preço ano 2: " + preco2);
        System.out.println("Preço ano 3: " + preco3);
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }

    public double calcularPrecosMedios(double ano1, double ano2, double ano3) {
        return (ano1 + ano2 + ano3) / 3;
    }

    public double menorPreco() {
        double menorPreco = preco1;

        if (preco2 < preco1) {
            menorPreco = preco2;
        }
        if (preco3 > preco2) {
            menorPreco = preco3;
        }

        return menorPreco;
    }

    public double maiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > preco1) {
            maiorPreco = preco2;
        }
        if (preco3 > preco2) {
            maiorPreco = preco3;
        }

        return maiorPreco;
    }
}

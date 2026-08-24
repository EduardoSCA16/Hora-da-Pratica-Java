package br.com.alura.horadapratica.carro.models;

public class ModeloCarro extends Carro {
    private String cor;
    private int portas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}

package br.com.alura.horadapratica.circulo;

public class Circulo implements Forma {
    private double raio;
    private double pi = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (raio * raio);
    }
}

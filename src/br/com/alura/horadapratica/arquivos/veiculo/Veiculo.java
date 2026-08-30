package br.com.alura.horadapratica.arquivos.veiculo;

import com.google.gson.annotations.SerializedName;

public class Veiculo {
    //@SerializedName("Modelo")
    private String modelo;
    //@SerializedName("Marca")
    private String marca;
    //@SerializedName("Combustível")
    private String combustivel;

    // Construtor normal
    public Veiculo(String modelo, String marca, String combustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.combustivel = combustivel;
    }
    // Construtor Record
    public Veiculo(VeiculoRecord meuRecord) {
        this.modelo = meuRecord.nome();
        this.marca = meuRecord.marca();
        this.combustivel = meuRecord.combustível();
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Combustível: " + getCombustivel();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

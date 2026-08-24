package br.com.alura.horadapratica.produto.models;

public class ProdutoPerecivel extends Produto {
    private String validade;

    // Getter e Setter
    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    // Constructor
    public ProdutoPerecivel(String nome, double preco, int qtd, String validade) {
        super(nome, preco, qtd);
        this.validade = validade;
    }

    // toString
    @Override
    public String toString() {
        return "Item: " + getNome() + " Preço: " + getPreco() + " Qtd: " + getQuantidade() + " Data Val: " + getValidade();
    }
}

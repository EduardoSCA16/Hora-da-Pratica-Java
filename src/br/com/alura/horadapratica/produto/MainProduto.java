package br.com.alura.horadapratica.produto;

import br.com.alura.horadapratica.produto.models.Produto;
import br.com.alura.horadapratica.produto.models.ProdutoPerecivel;

import java.util.ArrayList;

public class MainProduto {
    static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Papel", 12.50, 50);
        Produto p2 = new Produto("Tesoura", 5.50, 100);
        Produto p3 = new Produto("Lapiseira", 3.90, 30);
        Produto p4 = new Produto("Borracha", 2.00, 60);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        System.out.println(produtos);

        ProdutoPerecivel pereciveeeel = new ProdutoPerecivel("Feijão", 8.90, 120, "12-10-2026");
        System.out.println(pereciveeeel);
    }
}

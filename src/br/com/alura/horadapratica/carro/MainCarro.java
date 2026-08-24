package br.com.alura.horadapratica.carro;

import br.com.alura.horadapratica.carro.models.ModeloCarro;

public class MainCarro {
    static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setNomeModelo("Fiat Argo");
        carro1.setPreco1(15700);
        carro1.setPreco2(18200);
        carro1.setPreco3(17950);
        carro1.setCor("Branco");
        carro1.setPortas(4);

        carro1.exibirInfo();
        System.out.println("Preço médio em 3 anos: " + carro1.calcularPrecosMedios(carro1.getPreco1(), carro1.getPreco2(), carro1.getPreco3()));
    }
}

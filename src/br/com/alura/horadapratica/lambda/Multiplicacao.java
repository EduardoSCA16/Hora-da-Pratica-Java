package br.com.alura.horadapratica.lambda;

@FunctionalInterface
interface IMultiplicacao {
    int multiplicacao(int a, int b);
}

public class Multiplicacao {
    static void main(String[] args) {

        IMultiplicacao mult = (a, b) -> a * b;
        System.out.println(mult.multiplicacao(5, 3));
    }
}

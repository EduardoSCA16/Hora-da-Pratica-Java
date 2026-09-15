package br.com.alura.horadapratica.lambda;

@FunctionalInterface
interface IDivisor {
    int dividir(int x, int y);
}

public class Divisor {
    static void main(String[] args) {

        IDivisor divisor = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por 0");
            }
            return a / b;
        };

        try {
            System.out.println(divisor.dividir(15, 5)); // Resultado: 3
            System.out.println(divisor.dividir(12, 0)); // Resultado: Erro
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

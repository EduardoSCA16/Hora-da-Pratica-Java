package br.com.alura.horadapratica.lambda;

@FunctionalInterface
interface Primo {
    boolean verificarPrimo(int numero);
}

public class NumPrimo {
    static void main(String[] args) {

        // Verificando se o número é primo
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11)); // true
        System.out.println(primo.verificarPrimo(12)); // false
    }
}

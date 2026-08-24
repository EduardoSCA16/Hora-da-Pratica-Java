package br.com.alura.horadapratica.animal;

public class MainAnimal {
    static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        // Realizando o casting
        Animal animal = (Animal) c1;

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("Esta variável é da classe Cachorro.");
        } else {
            System.out.println("Esta variável não é um Cachorro.");
        }

    }
}

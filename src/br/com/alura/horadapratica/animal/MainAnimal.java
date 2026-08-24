package br.com.alura.horadapratica.animal;

import br.com.alura.horadapratica.animal.models.Cachorro;
import br.com.alura.horadapratica.animal.models.Gato;

public class MainAnimal {
    static void main(String[] args) {
        Cachorro rocky = new Cachorro();
        Gato pido = new Gato();

        rocky.emitirSom();
        rocky.abanarRabo();

        pido.emitirSom();
        pido.arranharMoveis();
    }
}

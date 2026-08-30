package br.com.alura.horadapratica.arquivos.arquivotxt;

import java.io.FileWriter;
import java.io.IOException;

public class MainArquivoTxt {
    static void main(String[] args) throws IOException {

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write("Conteúdo a ser gravado no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

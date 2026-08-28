package br.com.alura.horadapratica.exception.usuario;

public class SenhaInvalidaException extends Exception {
    private String mensagem;

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }
}

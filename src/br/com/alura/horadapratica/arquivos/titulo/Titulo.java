package br.com.alura.horadapratica.arquivos.titulo;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private int horasDuracao;

    public Titulo(String nome, int anoLancamento, int horasDuracao) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.horasDuracao = horasDuracao;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getHorasDuracao() {
        return horasDuracao;
    }

    public void setHorasDuracao(int horasDuracao) {
        this.horasDuracao = horasDuracao;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Ano Lançamento: " + getAnoLancamento() + "\n" +
                "Horas Duração: " + getHorasDuracao();
    }
}

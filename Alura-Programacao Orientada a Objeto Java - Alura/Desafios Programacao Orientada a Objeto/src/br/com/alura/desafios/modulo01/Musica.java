package br.com.alura.desafios.modulo01;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
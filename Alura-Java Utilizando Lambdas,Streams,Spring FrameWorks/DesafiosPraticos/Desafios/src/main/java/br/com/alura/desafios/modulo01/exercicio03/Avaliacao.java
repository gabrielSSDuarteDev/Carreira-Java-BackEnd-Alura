package br.com.alura.desafios.modulo01.exercicio03;

import br.com.alura.desafios.modulo01.exercicio02.Tarefa;

import java.util.List;

public class Avaliacao<T> {
    private T item;
    private Double nota;
    private String comentario;

    public Avaliacao(T item, Double nota, String comentario) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10.");
        }
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;

    }


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10.");
        }
        this.nota = nota;
    }


    public static <T> Double calcularMedia(List<Avaliacao<T>> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A lista de Avalicações está vazia.");
        }
        Double soma =0.0;
        for (Avaliacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.getNota();
        }
        return soma/avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Avaliacao de item: " +
                "\nItem Avaliado:" + item +
                "\nNota da Avaliacao: " + nota +
                "\nComentario: " + comentario;
    }
}

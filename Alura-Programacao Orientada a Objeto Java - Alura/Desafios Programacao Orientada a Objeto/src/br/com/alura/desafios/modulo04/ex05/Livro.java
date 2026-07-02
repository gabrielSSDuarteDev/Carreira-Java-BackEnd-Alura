package br.com.alura.desafios.modulo04.ex05;

public class Livro extends Produto {
    private String autor;
    private double preco;
    public double calcularPrecoFinal(Produto produto) {
        return preco * 0.9;
    }
}

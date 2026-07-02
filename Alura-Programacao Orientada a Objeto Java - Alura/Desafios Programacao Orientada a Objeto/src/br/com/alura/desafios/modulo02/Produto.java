package br.com.alura.desafios.modulo02;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void aplicarDesconto(Produto pro){
        if(pro.getQuantidade() >= 10){
            preco -= preco * (5.0 /100);
        }else{
            preco -= preco;
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

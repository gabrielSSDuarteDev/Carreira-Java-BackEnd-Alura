package br.com.alura.desafios.modulo01;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calculaIdade() {
        return 2026 - ano;
    }
}
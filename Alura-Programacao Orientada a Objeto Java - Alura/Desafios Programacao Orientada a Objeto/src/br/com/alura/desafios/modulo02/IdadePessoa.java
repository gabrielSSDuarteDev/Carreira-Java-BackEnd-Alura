package br.com.alura.desafios.modulo02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificarIdade(IdadePessoa idadePessoa){
        if(getIdade() >= 18){
            System.out.println(" menor de idade");
        }else {
            System.out.println(" maior de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

package br.com.alura.desafios.modulo01.exercicio02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;


public class Tarefa {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }


    public void Serializar(Tarefa tarefa) {

        try( FileWriter escritor = new FileWriter("tarefa.json")){
           String json = gson.toJson(tarefa);
            gson.toJson(tarefa, escritor);
            System.out.println("Tarefa Serializada com sucesso!" +
                                "\n" + json);
        }catch(IOException e){
            System.out.println("Erro ao serializar tarefa!" + e.getMessage());
        }

    }

    public void Deserializar(Tarefa tarefa)  {
        try( FileReader escritor = new FileReader("tarefa.json")){
            Tarefa arquivo = gson.fromJson(escritor,tarefa.getClass());
            System.out.println("Tarefa Deserializada com sucesso!" + arquivo);
        }
        catch(IOException e){
            System.out.println("Erro ao deserializar tarefa!" + e.getMessage());
        }
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa:" +
                "\nDescricao: " + descricao +
                "\nConcluida: " + concluida +
                "\nPessoaResponsavel: " + pessoaResponsavel;
    }


}

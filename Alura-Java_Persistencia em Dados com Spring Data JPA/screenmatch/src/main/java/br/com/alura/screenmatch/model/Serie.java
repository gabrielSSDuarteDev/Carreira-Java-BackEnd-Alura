package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.OptionalDouble;

public class Serie {

    private String titulo;
    private String sinopse;
    private Double avaliacao;
    private Integer totalTemporada;
    private String duracao;
    private Categoria genero;
    private String atores;
    private String poster;


    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.sinopse = dadosSerie.sinopse();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
        this.totalTemporada  = dadosSerie.totalTemporada();
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();

    }



}

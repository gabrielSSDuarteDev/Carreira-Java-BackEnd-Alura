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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(Integer totalTemporada) {
        this.totalTemporada = totalTemporada;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Serie: " +
                "genero=" + genero +'\'' +
                "titulo='" + titulo + '\'' +
                "sinopse='" + sinopse + '\'' +
                "avaliacao=" + avaliacao +
                "totalTemporada=" + totalTemporada +
                "duracao='" + duracao + '\'' +
                "atores='" + atores + '\'' +
                "poster='" + poster + '\'';
    }
}

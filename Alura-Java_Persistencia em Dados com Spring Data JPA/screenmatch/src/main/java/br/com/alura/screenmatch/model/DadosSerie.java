package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonProperty("Title") String titulo,
        @JsonProperty("imdbRating") String avaliacao,
        @JsonProperty("totalSeasons") Integer totalTemporada,
        @JsonProperty("Runtime") String duracao
) {
}
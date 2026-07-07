package br.com.alura.FindCar.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(
        @JsonAlias("TipoVeiculo") Integer tipoVeiculo,
        @JsonAlias("Valor")String preco,
        @JsonAlias("Modelo")String modelo
) {

}

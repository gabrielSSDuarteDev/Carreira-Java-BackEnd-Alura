package br.com.alura.FindCar.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosVeiculo {
    private Integer TipoVeiculo;
    private String Valor;
    private String Marca;
    private String Modelo;
}

package br.com.alura.FindCar.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverterDadosAPI {
    <T> T obterDados(String json, Class<T> classe) ;
}

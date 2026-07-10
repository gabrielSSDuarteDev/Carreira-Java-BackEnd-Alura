package br.com.alura.screenmatch.service;

import org.springframework.cglib.core.ClassesKey;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> classe);



}

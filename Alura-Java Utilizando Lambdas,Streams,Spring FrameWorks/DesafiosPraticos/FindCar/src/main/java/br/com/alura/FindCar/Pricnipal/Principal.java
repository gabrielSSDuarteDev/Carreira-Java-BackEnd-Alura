package br.com.alura.FindCar.Pricnipal;

import br.com.alura.FindCar.model.Dados;
import br.com.alura.FindCar.model.modelos;
import br.com.alura.FindCar.service.ConsumoAPI;
import br.com.alura.FindCar.service.ConverterDadosApi;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
        private final static Scanner sc = new Scanner(System.in);
        private final static ConsumoAPI consumo = new ConsumoAPI();
        private final static ConverterDadosApi converter = new ConverterDadosApi();
        private final String urlBASE = "https://parallelum.com.br/fipe/api/v1/";


    public void exibirMenu() throws IOException, InterruptedException {

        var menu = """
            ==================================
                      Menu de Opções 
            ==================================
            Digite o tipo de veículo desejado: 
            -> Carro
            -> Moto
            -> Caminhão
            ==================================
            """;
        System.out.println(menu);
        var opcao = sc.nextLine();
        String endereco = null;

        if(opcao.toLowerCase().contains("carr")){
            endereco = urlBASE+"carros/marcas";
        }else if(opcao.toLowerCase().contains("mot")){
            endereco = urlBASE+"motos/marcas";
        }else if(opcao.toLowerCase().contains("camin")){
            endereco = urlBASE+"caminhoes/marcas";
        }

        var json = consumo.obterDadosCarro(endereco);
        System.out.println(json);
        var marcas = converter.obterLista(json, Dados.class);


        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Digite o código da marca desejada para consulta: ");
        var codigoMarca = sc.nextLine();

        endereco += "/"+codigoMarca+"/modelos";
        json = consumo.obterDadosCarro(endereco);
        var modelos = converter.obterDados(json, modelos.class);

        System.out.println("Modelos dessa Marca: ");
        modelos.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

    }

}

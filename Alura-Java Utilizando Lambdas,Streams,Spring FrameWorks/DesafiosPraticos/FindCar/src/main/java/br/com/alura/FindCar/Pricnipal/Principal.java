package br.com.alura.FindCar.Pricnipal;

import br.com.alura.FindCar.service.ConsumoAPI;
import br.com.alura.FindCar.service.ConverterDadosApi;

import java.io.IOException;
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

        System.out.println("Agora digite a marca desejada de acordo com o codigo ao lado: ");
        var codigo = sc.nextLine();

        endereco = endereco +"/"+codigo+"/modelos/";
        json = consumo.obterDadosCarro(endereco);
        System.out.println(json);


        System.out.println("Agora digite modelo desejada de acordo com o codigo ao lado: ");
        var NUM = sc.nextLine();

        endereco = endereco +NUM+"/anos";
        json = consumo.obterDadosCarro(endereco);
        System.out.println(json);



        System.out.println("Por fim  digite o ano desejado de acrodo com o ano e o codigo informado ao lado ");
        var ano= sc.nextLine();
        var id = sc.nextLine();

    endereco = endereco +"/"+ano+"-"+id;
        json = consumo.obterDadosCarro(endereco);
        System.out.println(json);
    }

}

package br.com.alura.FindCar;

import br.com.alura.FindCar.model.DadosVeiculo;
import br.com.alura.FindCar.service.ConsumoAPI;
import br.com.alura.FindCar.service.ConverterDadosApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindCarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FindCarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Podemos começar! ");
		System.out.println("Testando API");

		ConsumoAPI  consumo = new ConsumoAPI();
		ConverterDadosApi converter = new ConverterDadosApi();


		var json = consumo.obterDadosCarro("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3");
		var response = converter.obterDados(json, DadosVeiculo.class);
		System.out.println(response);


	}
}

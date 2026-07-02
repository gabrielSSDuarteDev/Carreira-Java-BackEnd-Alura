package br.com.alura.desafios.modulo04;
import br.com.alura.desafios.modulo04.ex01.ConversosMoeda;
import br.com.alura.desafios.modulo04.ex02.CalcularRetangulo;
import br.com.alura.desafios.modulo04.ex03.TabuadaMultiplicacao;
import br.com.alura.desafios.modulo04.ex04.ConversorAmbiente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConversosMoeda conversor = new ConversosMoeda();
        conversor.converterDolarParaReal(50);


        CalcularRetangulo cr = new CalcularRetangulo();
        cr.calcularArea(5, 8);
        cr.calcularPerimetro(5, 8);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);

        ConversorAmbiente converter = new ConversorAmbiente();
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = converter.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");
        temperaturaFahrenheit = 77;
        temperaturaCelsius = converter.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");



    }
}

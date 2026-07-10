package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisode;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class PrincipalClasse {



    private Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converteDados = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String APIKEY = "&apikey=e9080fa4";


    public void selecionarMenu() throws IOException, InterruptedException {
        var menu = """
                =====================================
                             ScreenMatch
                =====================================
                Digite o numero da opção desejada:
                1-Buscar Série
                2-Buscar Episódios
                0-Sair
                =====================================
                """;

        System.out.println(menu);
        var opcao = sc.nextInt();


        switch(opcao){
            case 1:
                buscarSerieWeb();
                break;
            case 2:
                buscarEpisodioWeb();
                break;
            case 0:
                System.out.println("Saindo do ScreenMatch....");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private void buscarSerieWeb() throws IOException, InterruptedException {
        DadosSerie dados = getDadosSerie();
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() throws IOException, InterruptedException {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = sc.nextLine();
        var enderecoCompleto = ENDERECO + nomeSerie.replace(" ", "+") + APIKEY;
        var json = consumoAPI.obterDadosSeries(enderecoCompleto);
        DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dados);
        return dados;

    }



    public void buscarEpisodioWeb() throws IOException, InterruptedException {

        DadosSerie dadosSerie = getDadosSerie();
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporada(); i++) {
            var json = consumoAPI.obterDadosSeries(ENDERECO + dadosSerie.titulo().replace(" ", "+") + "&Season=" + i + APIKEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }

}
package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.*;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import io.micrometer.common.KeyValues;

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
    private List<DadosSerie> series =  new ArrayList<>();


    public void selecionarMenu() throws IOException, InterruptedException {


        var opcao = -1;
        while(opcao!= 0){
        var menu = """
                =====================================
                             ScreenMatch
                =====================================
                Digite o numero da opção desejada:
                1-Buscar Série
                2-Buscar Episódios
                3-Listar Séries Buscadas
                0-Sair
                =====================================
                """;

        System.out.println(menu);
        opcao = sc.nextInt();
        sc.nextLine();


        switch(opcao){
            case 1:
                buscarSerieWeb();
                break;
            case 2:
                buscarEpisodioWeb();
                break;
            case 3:
                listarSeriesBuscadas();
                break;

            case 0:
                System.out.println("Saindo do ScreenMatch....");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
        }
    private DadosSerie getDadosSerie(String nomeSerie) throws IOException, InterruptedException {

        var enderecoCompleto = ENDERECO +nomeSerie.replace(" ", "+") + APIKEY;
        var json = consumoAPI.obterDadosSeries(enderecoCompleto);
        DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
        return dados;

    }
    private void buscarSerieWeb() throws IOException, InterruptedException {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = sc.nextLine();
        DadosSerie dados = getDadosSerie(nomeSerie);
        series.add(dados);
        System.out.println(dados);
    }

    public void buscarEpisodioWeb() throws IOException, InterruptedException {
        System.out.println("Digite o nome da série para buscar os episódios: ");
        var nomeSerie = sc.nextLine();

        DadosSerie dadosSerie = getDadosSerie(nomeSerie);
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporada(); i++) {
            var json = consumoAPI.obterDadosSeries(ENDERECO + dadosSerie.titulo().replace(" ", "+") + "&Season=" + i + APIKEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }

    private void listarSeriesBuscadas() throws IOException, InterruptedException {
       List<Serie> infoSeries = new ArrayList<>();
       infoSeries = series.stream()
               .map(Serie::new)
               .toList();

       infoSeries.stream()
               .sorted(Comparator.comparing(Serie::getGenero))
               .forEach(System.out::println);


    }


}
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

    public void exibeMenu() throws IOException, InterruptedException {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = sc.nextLine();
        var enderecoCompleto = ENDERECO + nomeSerie.replace(" ", "+") + APIKEY;
        var json = consumoAPI.obterDadosSeries(enderecoCompleto);
        DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dados);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporada(); i++) {
            json = consumoAPI.obterDadosSeries(ENDERECO + nomeSerie.replace(" ", "+") + "&Season=" + i + APIKEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);


       temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DadosEpisode> dadosEpisodes = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .toList();
        System.out.println("\n Melhores 10 episodios: ");
       dadosEpisodes.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .peek(e -> System.out.println("Episodios sem avaliação N/A:" + e))
               .sorted(Comparator.comparing(DadosEpisode::avaliacao).reversed())
               .peek(e -> System.out.println("Ordenando os episodios do mais avaliado a té o 10 menos avaliado" + e))
                .limit(10)
              .peek(e -> System.out.println("Limitando a 10 episodios " + e))
               .map(e -> e.titulo().toUpperCase())
                .peek(e -> System.out.println("Colocando estes episodios em maiusculo" + e))
               .forEach(System.out::println);


        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numeroTemp(), d))
                ).toList();

        episodios.forEach(System.out::println);

       System.out.println("Digite o nome do episodio ou um trecho do nome do episodio para encontra-lo: ");
       var trechoTitulo = sc.nextLine();
       Optional<Episodio> optionalEpisodio = episodios.stream()
               .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
                .findFirst();
     if(optionalEpisodio.isPresent()){
          System.out.println("Episodio encontrado com sucesso!");
          System.out.println(
                  "Temporada: " + optionalEpisodio.get().getTemporada()  +
                "\nEpisodio Numero: " +  optionalEpisodio.get().getNumeroEpisodio() +
                 "\nNome do Episodio: " + optionalEpisodio.get().getTitulo()) ;

      }else{
           System.out.println("Episodio não encontrado!");
       }



       System.out.println("A partir de que ano você deseja ver os episódios? ");
       var ano = sc.nextInt();
       sc.nextLine();


        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        episodios.stream().filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                .forEach(e -> System.out.println(
                        "Temporada: " + e.getTemporada() +
                               "Episodio: " + e.getTitulo() +
                                "Data Lançamento: " + e.getDataLancamento().format(formatter)));

        Map<Integer, Double> avalicoesPtemporada = episodios.stream()
                .filter(e-> e.getAvaliacao()>0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));

        System.out.println(avalicoesPtemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e-> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));


        System.out.println(est);




















    }

}
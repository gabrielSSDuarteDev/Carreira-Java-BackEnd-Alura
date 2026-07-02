package br.com.alura.desafios;

import br.com.alura.desafios.modulo01.Contador;
import br.com.alura.desafios.modulo01.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o exercício a ser executado:" +
							"\n1 -> Contador:  " +
							"\n2 -> Lista de Tarefas: ");

		int opcao = Integer.parseInt(sc.nextLine());


		switch (opcao) {
			case 1 -> new Contador<Integer>().contarAte();
			case 2 -> {
				Tarefa tarefa = new Tarefa("Lavar a Louça", true, "Gabriel");
				tarefa.Serializar(tarefa);
				tarefa.Deserializar(tarefa);
			}
		}


	}


}


package br.com.alura.desafios.modulo02;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class FuncoesLambda {
    private static final Scanner sc = new Scanner(System.in);

    public Double CalcularOperacao(String nomeOperacao, BinaryOperator<Integer> operacao) {
        System.out.println("\n--- " + nomeOperacao + " ---");
        System.out.println("Digite um número : ");
        int num1 =sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        int resultado = operacao.apply(num1, num2);
        System.out.println("Resultado: " +  resultado);
        return 0.0;
    }

    public void calcularMultiplicacao(){
        CalcularOperacao("Multiplicação", (a, b) -> a * b);
    }



        }
    }
}

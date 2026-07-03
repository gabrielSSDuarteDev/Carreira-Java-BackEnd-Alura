package br.com.alura.desafios.modulo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FuncoesLambda {
    private static final Scanner sc = new Scanner(System.in);

    public void CalcularOperacao(String nomeOperacao, BinaryOperator<Integer> operacao) {
        System.out.println("\n--- " + nomeOperacao + " ---");
        System.out.println("Digite um número : ");
        int num1 =sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        int resultado = operacao.apply(num1, num2);
        System.out.println("Resultado: " +  resultado);

    }

    public void calcularMultiplicacao(){
        CalcularOperacao("Multiplicação", (a, b) -> a * b);
    }

    public void verificadorNumPrimo(){
        System.out.println("Digite o numero para a verificação: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.printf("O número %d não é primo\n", num);
            return;
        }
        Predicate<Integer> divisaoExata = divisor -> (num % divisor == 0);
        Boolean resultado = divisaoExata.test(num);
        System.out.println(resultado);

        boolean numPrimo = IntStream.range(2, num)
                .boxed()
                .noneMatch(divisaoExata);
        if(numPrimo){
            System.out.printf("O numero %d é Primo\n ", num);
        }else{
            System.out.printf("O numero %d não é primo\n", num);
        }
    }


        public void transfomarMaiusuclo(){
            System.out.println("Digite a frase ou a palavra a ser transformada em maiusculo: ");
            String frase = sc.nextLine();
            Stream<String> linhas = Stream.of(frase.toUpperCase());
            linhas.forEach(System.out::println);
    }

    public void verificarPalindromo(){
        System.out.println("Digite a palavra para verificação: ");
        String palavra = sc.nextLine();

        String palvraOK= palavra.toLowerCase();
        int metade = palvraOK.length() / 2;

        boolean ehPalindromo = IntStream.range(0,metade)
                .allMatch(i -> palvraOK.charAt(i) == palavra.charAt(palavra.length()- 1 - i ));

        if(ehPalindromo){
            System.out.printf("A palavvra %s é um Palíndromo\n", palavra);
        }else {
            System.out.printf("A palavra %s não é um Palíndromo\n", palavra);
        }
    }

    public void transformarEmTriplo(){
        System.out.println("Digite quantos números haverão na sua lista: ");
        int limite = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < limite; i++){
            System.out.println("Digite o numero:" + (i + 1)  );
            numeros.add(sc.nextInt());
        }

        BinaryOperator<Integer> multiplicacao = (a, b) -> a * b;
        UnaryOperator<Integer> calcularTriplo = n -> multiplicacao.apply(n,3);



        List<Integer> numerosTriplicados = numeros.stream()
                .sorted()
                .map(calcularTriplo)
                .toList();

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Lista Original digitada: " + numeros);
        System.out.println("Lista Triplicada e Ordenada: " + numerosTriplicados);

    }

    public void calculoDivisao(){
        try{
            CalcularOperacao("Divisão", (a, b) -> a / b);
        }catch(ArithmeticException e){
            System.out.println("Não é possível divir por 0");
        }
    }



}

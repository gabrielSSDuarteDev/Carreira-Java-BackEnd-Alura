package br.com.alura.desafios.modulo01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Contador<T extends Number> {
    private Integer limite;




    public void contarAte(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Até que número deve ir a contagem: ");
         setLimite(sc.nextInt());

        System.out.println("--Começando contagem até " + getLimite() + " --");

      IntStream.range(1, getLimite() + 1)
              .forEach(i -> System.out.println("Numero: " + i));


        System.out.println("Fim da contagem: "+ getLimite() );
    }


    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }


}

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e
*pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve
*informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:
*Para gerar um número aleatório em Java: new Random().nextInt(100);
*Utilize o Scanner para obter os dados do usuário;
*Utilize uma variável para contar as tentativas;
*Utilize um loop para controlar as tentativas;
*Utilize a instrução break; para interromper o loop.
*
*
* */

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        //Número aleatório a ser gerado
        int numeroAleatorio = new Random().nextInt(100) + 1;
        System.out.println("numero aleatorio: " +  numeroAleatorio);

        int numeroDigitado = 0;
        // Instruções
        System.out.println("""
        ==================================
        Jogo De adivinhação
        ==================================
        ->Instruções:
        -Um número aleatório de 1 a 100 é gerado
        -A partir dos seus palpites e daas dicas do programa você deve descobrir qual numero é.
        -Você possui 5 tentativas,use-as com cuidado.
        -Boa sorte!
      
        """);


        //Inserção pelo usuário:
     for(int i = 0; i < 5; i++){
         System.out.println("Digite um número: ");
         numeroDigitado = sc.nextInt();

         if (numeroDigitado == numeroAleatorio) {
             System.out.println("Parabéns!! Você encontrou o número escolhido!!");
             break;
         } else if (numeroDigitado < numeroAleatorio) { // O digitado é MENOR que o secreto
             System.out.println("O número digitado ainda é menor que o número escolhido. Tente Novamente.");
         } else { // O digitado é MAIOR que o secreto
             System.out.println("O número digitado ainda é maior que o escolhido. Tente Novamente.");
         }

         int chances = 5 - (i + 1);
         if(chances > 0){
             System.out.printf("Você ainda tem: %d chances\n", chances);
         }
     }



     if(numeroDigitado != numeroAleatorio){
         System.out.println("Você falhou em decobrir qual era o número aleatório");
         System.out.printf("O número escolhido era: %d", numeroAleatorio);
     }



    }
}

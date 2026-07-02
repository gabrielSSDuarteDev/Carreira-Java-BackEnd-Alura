import java.util.Scanner;

/// Crie um programa que realize a média de duas notas decimais e exiba o resultado.
public class Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite mais um numero: ");
        int numero3 = sc.nextInt();

        float media = (float) (numero + numero2 + numero3) /3;

        System.out.printf("A media entre os 3 numeros é: %.2f",media);



    }

}

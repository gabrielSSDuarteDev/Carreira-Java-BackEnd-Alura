import  java.util.Scanner;

/// Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
public class Palavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma Letra: ");
        String letra = sc.nextLine();
        System.out.println("Digite uma palavra que comece com essa letra para poder ser completada: ");
        String palavra = sc.nextLine();
        System.out.printf("A palavra completa é: %s%s",letra,palavra);
    }
}


import java.util.Scanner;

public class Perfil02 {
    /*
 ======================================
    Desafio: hora da prática
 =====================================
  2- Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".

     */
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Olá qual o seu nome?");
            String nome = sc.nextLine();
            System.out.println("Olá, " +  nome);
            System.out.println("Tudo bem? " +  nome);

        }
    }


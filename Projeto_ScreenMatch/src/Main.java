import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        String filme1 = "Interestelar";
        String filme2 = "TopGun";
        String filme3 = "Divergente";


        int anoDelancamento = 0;
        double notaDoFilme = 0;
        boolean inPlano = false;
        String sinopse = "";
        double feedback;

        System.out.printf("""
        Digite o nome do filme que você busca:
        Opções:
        -%s
        -%s
        -%s
        """, filme1, filme2, filme3);

        String nome = sc.nextLine();

        while (nome.isBlank()) {
            System.out.println("[ERRO] => O nome não pode ser vazio. Digite o nome do filme: ");
            nome = sc.nextLine();
        }

        System.out.println("Dê uma nota para o filme escolhido: ");
        feedback = sc.nextDouble();


        switch (nome) {
            case "Interestelar":
                anoDelancamento = 2014;
                notaDoFilme = 9.7;
                inPlano = true;
               sinopse = "Filme de ficção Cíentifica sobre buracos negros";


            case "TopGun":
                anoDelancamento = 1990;
                notaDoFilme = 6.7;
                inPlano = false;
                sinopse = "Filme retro de galã dos anos 90";


            case "Divergente":
                anoDelancamento = 2015;
                notaDoFilme = 8.5;
                inPlano = false;

            default:
                System.out.println("[ERRO] => Digite o nome do filme: ");
                break;


    }

        System.out.printf("""
    ==================================================|
                        Descrição                     |
    ==================================================|
                                                  |
    - O filme que você buscou foi: %s               |
    - Ano de lançamento: %d                             |
    - Nota média do sistema: %.1f                   |
    - Está incluído no plano? %b                        |
    - Sua nota para o filme: %.1f                     |
    - Sinopse: %s                                     |
                                                      |
    ===================================================
    """, nome, anoDelancamento, notaDoFilme, inPlano, feedback, sinopse);

        sc.close();
    }
}
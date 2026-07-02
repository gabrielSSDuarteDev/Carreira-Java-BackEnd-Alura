import java.util.Scanner;
/// Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
public class Produto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco_produto = 50.99;

        System.out.printf("O preco do produto é %.2f\n",preco_produto);
        System.out.println("Digite a quantidade de produtos que você deseja: \n");
        int quantidade = sc.nextInt();

       double total = preco_produto * quantidade;

        System.out.printf("O valor total a ser pago é %.2f",total);


    }
}

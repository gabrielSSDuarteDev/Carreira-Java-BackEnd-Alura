
/// Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado
public class Casting{
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}
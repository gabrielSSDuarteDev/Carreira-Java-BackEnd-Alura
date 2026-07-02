package br.com.alura.desafios.modulo03;

public class VerificarPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}

package br.com.alura.desafios.modulo03;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}

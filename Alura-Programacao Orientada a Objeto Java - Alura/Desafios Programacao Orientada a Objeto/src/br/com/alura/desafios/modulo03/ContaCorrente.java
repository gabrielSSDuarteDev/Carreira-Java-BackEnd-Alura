package br.com.alura.desafios.modulo03;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}

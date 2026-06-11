import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double saldo = 5000.00;
        int op = 0;


        System.out.printf("""
                ==================================================
                                    CountBank
                ==================================================
               
                **************************************************
                Dados iniciais do cliente:
                
                Nome:               Gabriel Soares de Souza Duarte
                Tipo de Conta:      Corrente
                Saldo Inicial:      R$%.2f
               
                **************************************************
                
         
                """,saldo);


        System.out.println("""
                =======================================
                           MENU DE OPERAÇÕES
                =======================================
                -> Digite a operação a ser executada:
                
                1. Consultar Saldos
                2. Receber Valor
                3. Transferir valor
                4. Sair da Aplicação
                
                
                """);

        while(op != 4){
            System.out.println("Digite o número correspondente a operação desejada: \n");
            op = sc.nextInt();
            if (op == 1) {
                consultarSaldo(saldo);
            }else if(op == 2) {
                System.out.println("Digte o valor a ser adicionado ao seu saldo: \n");
                double valorDeposito = sc.nextDouble();
                saldo = receberValor(saldo,valorDeposito);
            }else if(op == 3) {
                System.out.println("Digite o valor a ser retirado do seu saldo: \n");
                double valorTransferencia = sc.nextDouble();
                saldo = tranferirValor(saldo,valorTransferencia);
            }else if(op == 4) {
                System.out.println("Encerrando Aplicação.....Fim");
            }
        }




    }

    private static double tranferirValor(double saldo, double valorTransferencia) {
        if(saldo < valorTransferencia || valorTransferencia <=  0) {
            System.out.println("[ERRO] saldo insuficiente\n");
        }else if(saldo >= valorTransferencia) {
            saldo -= valorTransferencia;
            System.out.printf("Tranferindo R$%.2f\n",valorTransferencia);
            System.out.printf("Saldo atual: R$%.2f\n", saldo);

        }

        return saldo;
    }

    private static double receberValor(double saldo, double valorDeposito) {
        if(valorDeposito > 0){
            saldo += valorDeposito;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valorDeposito);
            System.out.printf("Saldo atual: R$%.2f\n", saldo);
        }
        else{
            System.out.println("[ERRO] Valor de Depósito inválido");
        }

        return saldo;
    }



    private static void consultarSaldo(double saldo){
        System.out.printf("O seu saldo Disponível é igual a: R$%.2f%n\n", saldo);
    }
}

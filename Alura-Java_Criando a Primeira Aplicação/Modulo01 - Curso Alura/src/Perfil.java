import java.util.Scanner;
/*
======================================
Desafio: hora da prática
=====================================
1- Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".

 */
 public class Perfil {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Olá, " +  nome);

    }
 }
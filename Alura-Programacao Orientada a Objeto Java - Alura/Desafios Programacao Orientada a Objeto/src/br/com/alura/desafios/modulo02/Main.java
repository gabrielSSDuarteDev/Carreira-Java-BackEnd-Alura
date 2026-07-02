package br.com.alura.desafios.modulo02;

public class Main {
    public static void main(String[] args) {
        //Instancia da classe contaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(12345);
        conta.setTitular("Alura");
        conta.setSaldo(500);
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
        System.out.println("===================================================");


        //Instancia da classe IdadePessoa
        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Gabriel");
        idade.setIdade(19);
        idade.verificarIdade(idade);
        System.out.println("===================================================");

        //Instacia da classe Produto
        Produto produto = new Produto();
        produto.setNome("camiseta");
        produto.setQuantidade(10);
        produto.setPreco(500);
        produto.aplicarDesconto(produto);
        System.out.println("O preco do produto após o desconto é: " +  produto.getPreco());
        System.out.println("===================================================");


        //Instancia da classe Aluno
        Aluno aluno = new Aluno("Eduardo",6.5,7,3.5);
        System.out.println("A media do aluno foi: " + aluno.calcularMedia());
        System.out.println("===================================================");


        //Instancia da classe Livro
        Livro livro = new Livro();
        livro.setAutor("Aghata Cristie");
        livro.setTitulo("Perdidos na mesopotamia");
        livro.exibirDetalhes();
        System.out.println("===================================================");

    }
}

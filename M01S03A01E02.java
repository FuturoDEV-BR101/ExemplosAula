import java.util.Scanner;

public class M01S03A01E02 {
    
    // Utilizando a estrutura While, faça um programa que simule um caixa de uma padaria, 
    // a cada produto deve solicitar ao usuário o preço do produto e se o usuário quer encerrar a venda. 
    // Ao final informar o valor total da venda.

    public static void main(String[] args) {
        
        int contadorProdutos = 0 ;
        int opcao = 0 ;
        double precoProduto ;
        double totalProdutos = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nova Venda iniciada...");
        System.out.println("Digite o valor do produto");

        precoProduto = entrada.nextDouble();
        totalProdutos += precoProduto;
        contadorProdutos++;

        System.out.println("Deseja encerrar a venda ? Digite 1 para encerrar e 2 para continuar");
        opcao = entrada.nextInt();

        while (opcao == 2) {
            System.out.println("Digite o valor do produto");
            precoProduto = entrada.nextDouble();
            totalProdutos += precoProduto;
            contadorProdutos++;
            System.out.println("Deseja encerrar a venda ? Digite 1 para encerrar e 2 para continuar");
            opcao = entrada.nextInt();
        }

        System.out.println("Total da Venda = " + totalProdutos);
        System.out.println("Total de Produtos = " + contadorProdutos);

        entrada.close();
    }
}

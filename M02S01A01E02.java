import java.util.Scanner;

public class M02S01A01E02 {

    //    Uma empresa está implantando um sistema automatizado de atendimento aos clientes e fornecedores,
    //    ao estilo WhatsApp. Os setores da empresa são divididos em 3 :
    //    Depto Comercial;
    //    Depto Financeiro;
    //    Depto RH;
    //    Faça um programa que imprima na tela ao usuário suas opções e logo
    //    depois imprima qual foi a opção escolhida pelo usuário
    
        public static Scanner entrada = new Scanner(System.in);
        public static int opcao;
    
        public static void main(String[] args) {
    
            mostrarMenu();
    
            while ( !(opcao == 4) ) {
                opcaoSelecionada(opcao);
                mostrarMenu();
            }
    
        }
    
        private static void opcaoSelecionada(int opcao) {
            switch (opcao) {
                case 1:
                    System.out.println(" Opção escolhida é 1 - Depto Comercial ");
                    break;
                case 2:
                    System.out.println(" Opção escolhida é 2 - Depto Financeiro ");
                    break;
                case 3:
                    System.out.println(" Opção escolhida é 3 - Depto RH ");
                    break;
    
                default:
                    System.out.println(" Opção escolhida é Inválida!");
                    break;
            }
        }
    
    
        private static void mostrarMenu() {
            System.out.println("Menu de atendimento da empresa XPTO");
            System.out.println("Escolha 1 para Depto Comercial");
            System.out.println("Escolha 2 para Depto Financeiro");
            System.out.println("Escolha 3 para Depto RH");
            System.out.println("Escolha 4 para Sair");
            opcao = Integer.parseInt(entrada.nextLine());
        }
    
    
    
    }

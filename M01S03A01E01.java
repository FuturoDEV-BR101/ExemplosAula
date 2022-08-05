import java.util.Scanner;

public class M01S03A01E01 {
    
    // Utilizando a estrutura While, faça um programa que receba 2 números e o símbolo da operação desejada 
    // simulando então o funcionamento de uma calculadora. 
    // As operações necessárias serão ( * , / , + , - ). 
    // A ordem de como serão lidos os comandos do usuário será de sua preferência. 
    // A cada cálculo efetuado retorne ao usuário o resultado e solicite se o usuário deseja realizar um novo cálculo. 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double num1;
        double num2;

        while ( !opcao.equals("4")  ) {
            System.out.println("Digite a operação necessária ou '4' para Sair");
            System.out.println("Digite * para operação de Multiplicação");
            System.out.println("Digite / para operação de Divisão");
            System.out.println("Digite + para operação de Adição");
            System.out.println("Digite - para operação de Subtração");
            opcao = entrada.next();
            if ( opcao.equals("4") ){
                break;
            }
            System.out.println("Digite o primeiro número");
            num1 = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = entrada.nextDouble();
            switch (opcao) {
                case "*":
                    System.out.println("Resultado de " + num1 + " * " + num2 + " = " + (num1*num2));
                    break;
            
                case "/":
                    System.out.println("Resultado de " + num1 + " / " + num2 + " = " + (num1/num2));
                    break;
            
                case "+":
                    System.out.println("Resultado de " + num1 + " + " + num2 + " = " + (num1+num2));
                    break;
            
                case "-":
                    System.out.println("Resultado de " + num1 + " - " + num2 + " = " + (num1-num2));
                    break;
            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

        entrada.close();

    }
}

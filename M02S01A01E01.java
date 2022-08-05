import java.util.Scanner;

public class M02S01A01E01 {

    // Receber 3 valores de entrada do usuário e retornar o maior deles;

    public static void main(String[] args) {

        int num1 ;
        int num2 ;
        int num3 ;
        int maior;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        maior = Math.max(num1, num2);
        maior = Math.max(maior, num3);
        System.out.println(maior);

        entrada.close();

    }
}

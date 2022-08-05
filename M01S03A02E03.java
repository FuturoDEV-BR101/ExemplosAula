import java.util.Scanner;

public class M01S03A02E03 {
    
    // Escreva um aplicativo em Java que recebe inteiro e mostrar os números pares e ímpares (separados), de 1 até esse inteiro.
    public static void main(String[] args) {
        
        int n = 1;
        int m ;
        String impares = "";
        String pares = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        m = entrada.nextInt();

        while ( n <= m ) {
            if ( !( n % 2 == 0 ) ) {
                impares += ( n + ", ");
            } else {
                pares += ( n + ", ");
            }
            n++;
        }

        System.out.println("Números ímpares");
        System.out.println(impares);
        System.out.println("Números pares");
        System.out.println(pares);

        entrada.close();
    }
}

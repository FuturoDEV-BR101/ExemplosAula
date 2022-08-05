import java.util.Scanner;

public class JavaParaBaixinhos {

//     Xuxa, a rainha dos baixinhos, criou uma música que tem o seguinte formato:

// (n) patinhos foram passear
// Além das montanhas
// Para brincar
// A mamãe gritou: Quá, quá, quá, quá… Mas só (n) patinhos voltaram de lá.

// Que se repete até que nenhum patinho voltar de lá. Ao final, todos os patinhos voltam:
 
// A mamãe patinha foi procurar
// Além das montanhas
// Na beira do mar
// A mamãe gritou: Quá, quá, quá, quá
// E os (n) patinhos voltaram de lá.
 
// Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que foram passear.


    public static void main(String[] args) {

        int patinhosOriginal ;
        int patinhos ;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de Patinhos para iniciar a música");
        patinhosOriginal = entrada.nextInt();

        patinhos = patinhosOriginal;


        while ( patinhos >= 1 ) {
            primeiraParte(patinhos);
            patinhos--;
        }

        segundaParte(patinhosOriginal);

    }


    public static void primeiraParte(int n) {
        if ( n > 1){
            System.out.println(n + " Patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá… Mas só " + (n-1) + " patinhos voltaram de lá.");
        } else {
            System.out.println(n + " Patinho foi passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá… Mas nenhum patinho voltou de lá.");
        }
    }

    public static void segundaParte(int n) {
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + n + " patinhos voltaram de lá.");

    }

}

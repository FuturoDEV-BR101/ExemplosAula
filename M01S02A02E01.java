import java.util.Scanner;

public class M01S02A02E01 {
    // Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação , 
    // para aprovação o aluno deve possuir média superior a 7.0 ;

    public static void main(String[] args) {
        
        //Definindo as variáveis que serão utilizadas
        double nota1;
        double nota2;
        double nota3;
        double media;

        //Scanner será utilizado para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = entrada.nextDouble();

        media = ( nota1 + nota2 + nota3 ) / 3 ;

        if ( media >= 7 ) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }

        entrada.close();
    }

}

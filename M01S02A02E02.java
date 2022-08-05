import java.util.Scanner;

public class M01S02A02E02 {
    
    // Solicite número de faltas, 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação  , 
    // para aprovação o aluno deve possuir média superior a 7.0 
    // e presença superior a 80% e o número total de aulas é 20 ;


    public static void main(String[] args) {
        
        
        //Definindo as variáveis que serão utilizadas
        double nota1;
        double nota2;
        double nota3;
        double media;
        double presenca;
        int aulas = 20;
        int faltas;

        //Scanner será utilizado para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o total de Faltas");
        faltas = entrada.nextInt();
        System.out.println("Digite a nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = entrada.nextDouble();

        presenca = ( ((faltas / aulas)*-100) +100 );
        media = ( nota1 + nota2 + nota3 ) / 3 ;

        if ( ( media >= 7 ) && ( presenca >= 80 ) ) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    
        entrada.close();
    }
}

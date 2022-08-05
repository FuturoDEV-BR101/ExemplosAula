import java.util.ArrayList;
import java.util.Scanner;

public class M02S01A01E03 {

    //    Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação ,
    //    para aprovação o aluno deve possuir média superior a 7.0 ;
    
        public static Scanner entrada = new Scanner(System.in);
        public static ArrayList<Double> notas = new ArrayList<>();
    
        public static void main(String[] args) {
    
            solicitarNotas();
            calcularMedia(notas);
    
        }
    
        private static void calcularMedia(ArrayList<Double> notas) {
            double media = 0.0;
            for (double nota: notas ) {
                media += nota;
            }
            media = media / 3;
            System.out.println("Média calculada é " + media);
            if ( media > 7){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    
        private static void solicitarNotas() {
            System.out.println("Digite as 3 notas de 0.0 a 10.0");
            for ( int i = 0 ; i < 3 ; i++ ){
                notas.add(entrada.nextDouble());
            }
        }
    
    }
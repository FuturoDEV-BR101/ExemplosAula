import java.util.Scanner;

public class M01S04A01E01 {
    
    public static void main(String[] args) {

        String[] nomes ;
        int qtdNomes ;
        Scanner entradaText = new Scanner(System.in);

        System.out.println("Digite quantos nomes serão digitados ");
        qtdNomes = Integer.parseInt(entradaText.nextLine());
        nomes = new String[qtdNomes];

        for ( int indice = 0 ; indice < nomes.length ; indice++ ) {
            System.out.println("Digite o nome " + (indice+1) + " : ");
            nomes[indice] = entradaText.nextLine();
        }

        System.out.println("O array de String possui os elementos: ");
        for ( String nome : nomes ) {
            System.out.println(nome);
        }

        entradaText.close();
    }
}

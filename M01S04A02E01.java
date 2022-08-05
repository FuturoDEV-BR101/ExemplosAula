import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M01S04A02E01 {
    
//    Programa para adicionar nomes utilizando uma Collection ( ArrayList ):
//
//    Receba os nomes até que FIM seja digitado;
//    Mostre a lista de nomes em ordem alfabética;


    public static void main(String[] args) {


        List<String> nomes = new ArrayList<>();
        String nomeDigitado ;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nome ou FIM para finalizar");
        nomeDigitado = entrada.nextLine();
        while ( !nomeDigitado.toUpperCase().equals("FIM") ) {
            nomes.add(nomeDigitado);
            System.out.println("Digite nome ou FIM para finalizar");
            nomeDigitado = entrada.nextLine();
        }

        for (String nome:nomes) {
            System.out.println(nome);
        }

        entrada.close();

    }
    
}

public class EstruturaEscolha {
    
    //Exemplo de utilização da estrutura de escolha IF ELSE e Operador Ternário
    public static void main(String[] args) {
        
        String nome = "Elder";
        double media = 7.0;

        //utilização do IF sem ELSE
        if ( media < 7 ) {
            System.out.println("Não Aprovado!");
        }

        //utilização do IF com ELSE
        if ( media < 7 ){
            System.out.println(nome + " Não Aprovado!");
        } else {
            System.out.println(nome + " Aprovado!");
        }

        //Utilização do Operador Ternário
        System.out.println( (media < 7 ) ? nome + " Não Aprodado!" : nome + " Aprovado!" );
    }


}

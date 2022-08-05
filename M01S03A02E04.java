public class M01S03A02E04 {
    
    // Escreva um aplicativo em Java mostrando todos os números pares de 1 até 100.

    public static void main(String[] args) {
        
        int n = 1;
        int m = 100;
        
        while ( n <= m ) {
            if ( n % 2 == 0 )
            System.out.println(n);
            n++;
        }
    }
}

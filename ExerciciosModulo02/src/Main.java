import M02S02A01.Carro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá");

        Carro carro = new Carro(1234141412,
                "QTZ0987",
                "Fusca",
                "Azul",
                "1500");

        carro.acelerar(90);


    }
}
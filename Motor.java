
//    Faça um programa que disponibiliza uma interface controladora de um motor elétrico.
//    As definições da classe Motor são:
//    atributos : temperatura, velocidade, tensão aplicada.
//    métodos : alterar a velocidade, ler a temperatura.

public class Motor {

    //Atributos da classe
    double temperatura;
    double velocidade;
    int tensaoAplicada;

    //contrutor da classe
    public Motor() {
    }

    //Métodos da classe
    public void lerTemperatura() {
        System.out.println("Temperatura é " + this.temperatura);
    }

    public void alterarVelocidade(int vlc) {
        this.velocidade = this.velocidade + vlc;
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
    }

}

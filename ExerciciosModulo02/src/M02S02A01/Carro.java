package M02S02A01;

public class Carro {

    private int renavam;
    private String placa;
    private String modelo;
    private String cor;
    private String motor;
    private int velocidade;

    public Carro(int renavam, String placa, String modelo, String cor, String motor) {
        this.renavam = renavam;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidade = 0;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int acelerador) {
       this.setVelocidade( this.getVelocidade() + acelerador ) ;
        System.out.println("Velocidade Atual = " + getVelocidade());
    }
}

package M02S02A01;

public class ContaBancaria {

//    Utilizando a base do exerc�cio anterior (conta banc�ria).
//    Fa�a um programa que simule o funcionamento de uma conta banc�ria,
//    por�m agora ser� necess�rio um novo m�todo (imprimir extrato).
//    As defini��es da classe conta s�o:
//      atributos : n�mero da conta, nome do correntista, saldo da conta.
//      m�todos : depositar, sacar, imprimir saldo, imprimir extrato.

    private String numeroConta;
    private String nomeCorrentista;
    private double saldoConta;

    public ContaBancaria(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    //      m�todos : depositar, sacar, imprimir saldo, imprimir extrato.

    public void depositar() {

    }

    public void sacar() {

    }

    public void imprimirSaldo() {

    }

    public void imprimirExtrato() {

    }

}

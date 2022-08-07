package M02S02A01;

public class ContaBancaria {

//    Utilizando a base do exercício anterior (conta bancária).
//    Faça um programa que simule o funcionamento de uma conta bancária,
//    porém agora será necessário um novo método (imprimir extrato).
//    As definições da classe conta são:
//      atributos : número da conta, nome do correntista, saldo da conta.
//      métodos : depositar, sacar, imprimir saldo, imprimir extrato.

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

    //      métodos : depositar, sacar, imprimir saldo, imprimir extrato.

    public void depositar() {

    }

    public void sacar() {

    }

    public void imprimirSaldo() {

    }

    public void imprimirExtrato() {

    }

}

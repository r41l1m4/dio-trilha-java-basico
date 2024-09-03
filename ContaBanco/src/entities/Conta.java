package entities;

public class Conta {

    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private double saldo;

    private Conta(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public static Conta novaConta(int numero, String agencia, String nomeCliente) {
        return new Conta(numero, agencia, nomeCliente);
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

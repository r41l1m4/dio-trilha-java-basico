package entities;

public class Conta {

    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
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

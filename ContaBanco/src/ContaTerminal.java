import entities.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        int numeroConta;
        String agencia;
        String nomeCliente;

        System.out.println("Olá, bem-vindx a criação de conta.");
        System.out.println("Para começar, digite o número da agência:");
        agencia = new Scanner(System.in).next();

        System.out.println("Agora, digite o número da conta:");
        numeroConta = new Scanner(System.in).nextInt();

        System.out.println("Que tal se você nos disser seu nome completo?");
        nomeCliente = new Scanner(System.in).nextLine();

        System.out.println("Só um instante enquanto criamos sua conta...");

        Conta novaConta = Conta.novaConta(numeroConta, agencia, nomeCliente);
        Thread.sleep(2000);

        System.out.println("Prontinho!");
        System.out.println("Olá, " + novaConta.getNomeCliente() + "!. " +
                "Obrigado por criar uma conta em nosso banco. Sua agência é " +
                novaConta.getAgencia() + ", conta " + novaConta.getNumero() +
                " e seu saldo por enquanto é R$ " + novaConta.getSaldo());

    }
}
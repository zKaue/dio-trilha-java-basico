package Banco;

public class Main {

    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Pedrinho Santos");

        // Criando contas
        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);

        // Operações
        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300, cp);

        // Imprimindo extratos
        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();
    }
}

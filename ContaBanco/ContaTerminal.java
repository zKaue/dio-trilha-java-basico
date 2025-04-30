import java.util.Scanner;

public class ContaTerminal {

    private int numeroDaConta;
    private String numeroDaAgencia;
    private String nomeDoCliente;
    private double saldo;

    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        conta.numeroDaConta = sc.nextInt();
        sc.nextLine(); // CONSUMIR QUEBRA DE LINHA

        System.out.println("Por favor, digite o número da Agência!");
        conta.numeroDaAgencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        conta.nomeDoCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        conta.saldo = sc.nextDouble();

        String mensagem = "Olá ".concat(conta.nomeDoCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(conta.numeroDaAgencia)
                .concat(", conta ")
                .concat(String.valueOf(conta.numeroDaConta))
                .concat(" e seu saldo ")
                .concat(String.valueOf(conta.saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        sc.close();
    }
}

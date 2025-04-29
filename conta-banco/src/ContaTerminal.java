import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o numero da conta bancaria");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o numero da agencia");
        int numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o nome do cliente");
        String nomeTitular = scanner.nextLine();

        System.out.println("Informe o saldo da conta");
        double saldo = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(numeroConta, numeroAgencia, nomeTitular, saldo);

        System.out.println("Olá " + conta.titular + ", obrigado por criar uma conta em nosso banco,"
                             + " sua agência é " + conta.agencia + " , conta " + conta.numero +
                             " e seu saldo " + conta.saldo + " já está disponível para saque.");
          
        
    }
}

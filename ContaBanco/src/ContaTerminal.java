import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = input.nextInt();

        input.nextLine();

        System.out.print("Informe o número da agência: ");
        String agencia = input.nextLine();

        System.out.print("Informe o nome do cliente: ");
        String nome = input.nextLine();

        double saldo = 1020.66;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + conta + ", e seu saldo R$" + saldo + " já está disponível para saque.");


    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por gentileza digite sua agência");
        String agencia = scanner.nextLine();

        System.out.println("Por gentileza digite o nuúmero da sua conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Ola," + nome + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + ",e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
        
        
    }
}

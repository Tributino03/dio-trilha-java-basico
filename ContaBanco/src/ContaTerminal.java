import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        
        System.out.print("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da sua conta: ");
        double saldoConta = scanner.nextDouble();
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + 
                           " e seu saldo R$" + saldoConta + " já está disponível para saque.");
        
        scanner.close(); 
    }
}

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Define o Locale do Scanner para US para usar o ponto como separador decimal
        scanner.useLocale(Locale.US);

        // Solicita o número da conta ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        // Consumir a quebra de linha pendente após a entrada do número da conta
        scanner.nextLine();

        // Solicita o número da agência ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente ao usuário
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial ao usuário
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Fecha o Scanner após a leitura dos dados
        scanner.close();

        // Exibe a mensagem formatada com os dados fornecidos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}

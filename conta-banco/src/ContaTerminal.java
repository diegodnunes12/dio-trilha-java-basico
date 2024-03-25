import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // importando a classe scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");        
        Integer account = scanner.nextInt();
        // O int não pula linha, para resolver da um novo nextLine
        scanner.nextLine();

        System.out.println("Por favor, digite o código da agência: ");        
        String agency = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");        
        String name = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");        
        Double balance = scanner.nextDouble();
        // Converte para duas casas decimais
        String valueBalance = String.format("%.2f", balance);

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agency + ", conta  " + account + " e seu saldo " + valueBalance + " já está disponível para saque");
    }
}

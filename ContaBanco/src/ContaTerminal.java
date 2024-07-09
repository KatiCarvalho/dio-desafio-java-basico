import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o saldo que será depositado");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + " " + sobrenome);
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e conta " + conta +"");
        System.out.println("e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        
        System.out.print("Digite o valor que deseja depositar:\nR$ ");
        double saldo = scanner.nextDouble();


        System.out.print("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
        ", conta "+conta+" e seu saldo disponível para saque é de R$"+saldo);

        
    }


    
}

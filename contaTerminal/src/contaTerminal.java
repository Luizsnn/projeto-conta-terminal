import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Por favor, digite o seu nome!");
      String nomeCliente = scanner.next();

      System.out.println("Por favor, digite o seu Sobrenome!");
      String sobrenome = scanner.next();

      System.out.println("Por favor, digite o número da Agência!");
      String agencia = scanner.next();

      System.out.println("Por favor, digite o Saldo da sua conta!");
      double saldo = scanner.nextDouble();

      System.out.println("Por favor, digite o número da conta!");
      int numero = scanner.nextInt();

      System.out.println("Olá," + nomeCliente + sobrenome + "obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta" + numero + "e seu saldo" + saldo + "já está disponível para saque");
      




}
}
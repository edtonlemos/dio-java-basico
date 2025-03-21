
import java.util.Scanner;

/**
 * Define uma conta de banco que imprime as informações do cliente, receberá
 * dados via terminal contendo as características de conta em banco conforme
 * atributos.
 *
 * @author EOL
 * @since 20/03/2025
 * @version 1.0
 */
public class ContaTerminal {

    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = getScannerInstance();
        nomeCliente = insereNome();
        agencia = insereAgencia();
        numero = insereNumero();
        saldo = insereSaldo();
        cleanTerminal();
        printMessage();
    }

    /**
     * Limpa o terminal em que o sistema está sendo executado
     */
    private static void cleanTerminal() {
        System.out.print("\033\143");
    }

    /**
     * Realiza a exibição da mensagem com as informações do Cliente
     */
    private static void printMessage() {
        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia
                + ", conta "
                + numero
                + " e seu saldo "
                + saldo
                + " já está disponível para saque.");
    }

    /**
     * Inicializa um objeto do tipo Scanner
     *
     * @return new Scanner()
     */
    public static Scanner getScannerInstance() {
        return new Scanner(System.in);
    }

    /**
     * Realiza a entrada do nome do cliente
     *
     * @return new Scanner()
     */
    private static String insereNome() {
        System.out.println("Qual o seu nome?");
        return scanner.nextLine();
    }

    /**
     * Realiza a entrada da agencia do cliente
     *
     * @return new Scanner()
     */
    private static String insereAgencia() {
        System.out.println("Qual a sua agência?");
        return scanner.nextLine();
    }

    /**
     * Realiza a entrada do numero da conta do cliente
     *
     * @return new Scanner()
     */
    private static int insereNumero() {
        System.out.println("Qual o número da conta?");
        return scanner.nextInt();
    }

    /**
     * Realiza a entrada do saldo da conta do cliente
     *
     * @return new Scanner()
     */
    private static double insereSaldo() {
        System.out.println("Qual o saldo da conta?");
        return scanner.nextDouble();
    }

}

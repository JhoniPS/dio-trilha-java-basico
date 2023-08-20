import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numero = sc.nextInt();
        clearBuffer(sc);
        System.out.print("Digite o sua agêcia: ");
        String agencia = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();
        clearBuffer(sc);

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            " , conta " + numero + "  e seu saldo " + saldo + " já está disponível para saque");

    }

    // Tive problemas com o nextLine() que estava sendo pulando, provavelmente buffer do teclado.
    // Então esse método limpa o buffer.
    
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

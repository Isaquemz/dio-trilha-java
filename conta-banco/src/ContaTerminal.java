import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        /*
         * Base para projeto: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
         */
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero da sua conta: ");
        numero = Integer.parseInt(sc.nextLine());

        System.out.println("Digite qual a agencia da sua conta: ");
        agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o seu saldo: ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();
        
    }

}

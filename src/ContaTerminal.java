//Import logo abaixo
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        //TODO: Importar a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para os usuários 
        //Obter pelo Scanner os valores digitados pelo terminal
        System.out.println("Digite o número de sua Agência, exemplo: xxxx");
        int agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta, exemplo: xxxxx ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();        

        //Mostrar os valores digitados no terminal
        System.out.println("\nOlá "+ nomeCliente + ", obrigado por criar sua conta no DacotaBank em nossos caixas eletrônicos");
        System.out.println("Sua agência é: "+ agencia);
        System.out.println("O número da sua conta é: "+ numeroConta);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Não esqueça de validar seus dados e entregue seus documentos na sua agência <3");

    }

}

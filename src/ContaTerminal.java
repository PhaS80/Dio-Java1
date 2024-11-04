
import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int Numero;
        String Agencia;
        String Nome_Cliente;
        double Saldo = 1500.32;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência");
        Numero = x.nextInt();
        
        x.nextLine(); 
        
        System.out.println("Por favor, digite o seu nome");
        Nome_Cliente = x.nextLine();
        
        System.out.println("Por favor, digite o nome da sua Agência");
        Agencia = x.nextLine();
        
        System.out.println("Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "+ Agencia + ", conta " + Numero + ", e o seu saldo de " + Saldo + " já está disponível para saque");
        
        x.close();
    }
}
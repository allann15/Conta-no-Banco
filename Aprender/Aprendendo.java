package Aprender;
import java.util.Scanner;

class Aprendendo {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        Banco banco;
        System.out.println("Vamos Criar sua conta.");
        System.out.print("Insira o numero da sua conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Insira o seu nome: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Quer fazer depósito?");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println();
        System.out.println("Informe o valor do depósito inicial: ");
        double valorInicial = sc.nextDouble();
        banco = new Banco(numeroConta, nomeTitular, valorInicial);
        }else{
            banco = new Banco(numeroConta, nomeTitular);
        }
        
        
        System.out.println();
        System.out.println("Dados Conta: ");
        System.out.println(banco);
        System.out.println();
        System.out.print("Informe o valor do depósito: ");
        double acrescimo = sc.nextDouble();
        banco.deposito(acrescimo);
        
        System.out.println("Dados Atualizados :" + banco);

        System.out.println();
        System.out.print("Informe o valor do saque:");
        double decrescimo = sc.nextDouble();
        banco.saque(decrescimo);
        System.out.println("Dados novos :" + banco);

        sc.close();
}
}
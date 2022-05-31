package Aprender;

public class Banco {
    private int numeroConta;
    public Banco(int numeroConta, String nomeTitular, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(valorInicial);
        
    }
    public double getdinheiroConta() {
        return dinheiroConta;
    }

   
    private String nomeTitular;
    private double dinheiroConta;
  
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    
    public Banco(int numeroConta, String nomeTitular) {
        
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        
    }
    public void deposito(double acrescimo){
        this.dinheiroConta += acrescimo;
    }
    public void saque(double decrescimo){
        this.dinheiroConta -= decrescimo;
    }
    public String toString(){
        return "Banco "
        + numeroConta
        +", nome do titular"
        +nomeTitular
        +", deposito inicial : $ "
        +String.format("%.2f", dinheiroConta);
    }

}

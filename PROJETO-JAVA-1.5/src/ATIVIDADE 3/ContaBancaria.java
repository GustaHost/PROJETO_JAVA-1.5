import java.util.Scanner;
public class ContaBancaria{
    Scanner leitor = new Scanner(System.in);
    
    // esse private faz com que não se possa mecher nas variaveis fora da pasta original a  menos que use o setter (muda a variavel)e getter(coleta o valor atual da variavel)
    private int numeroConta;
    private String nomeTitular;
    private float saldo;
    //esse é o construtor que guarda o valor da variavel no objeto com o this. (não entendi mt bem mas creio que é isso)
     public ContaBancaria(int numeroConta, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    
    void sacarValor(){
        System.out.println("Informe o valor do saque dentro do limite do saldo: " + saldo);
        float saque = leitor.nextFloat();
        if(saldo < saque){
            System.out.println("Informe um valor dentro do limite da conta !! TENTE NOVAMENTE !!");
        }else{
            saldo -= saque;
            System.out.println("Operação concluida!  Seu saldo atual é de: " + saldo);
        }
        
    }
    
    void depositarValor(){
        System.out.println("Informe o valor para depositar na conta: " + numeroConta);
        float deposito = leitor.nextFloat();
        
            saldo += deposito;
            System.out.println("Operação concluida! Seu saldo atual é de: " + saldo);
    }
        
    
    
    void saldo(){
            System.out.println("Seu saldo atual é de: " + saldo);
    }
        
    
}
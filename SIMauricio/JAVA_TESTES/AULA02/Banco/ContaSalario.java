package Banco;

public class ContaSalario extends Conta {

    //Construtores da Classe Filha
    ContaSalario(){
    }
        
    ContaSalario(String agencia, String conta, float saldo){
        //Chama o Construtor da Classe Mãe
        super(agencia, conta, saldo); 
    }    

    public void lancarPgto(float valor){
        if (valor > 0.0f){
            this.saldo = this.saldo + valor;
        } else{
            System.out.println("Valor inválido!");
        }
    }
    
}

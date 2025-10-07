package Banco;

public class ContaPoupanca extends Conta {
    
    //Construtores da Classe Filha
    ContaPoupanca(){
    }
        
    ContaPoupanca(String agencia, String conta, float saldo){
        //Chama o Construtor da Classe Mãe
        super(agencia, conta, saldo); 
    }

    public void lancarJuros(float taxaJuros){
        if (taxaJuros >0.0f){
            this.saldo = this.saldo + (this.saldo*(taxaJuros/100));
        }
    }
}

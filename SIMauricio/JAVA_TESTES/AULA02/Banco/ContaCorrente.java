package Banco;

public class ContaCorrente extends Conta {
    public int qtdeCheques;

    //Construtores da Classe Filha
    ContaCorrente(){
    }
    
    ContaCorrente(String agencia, String conta, float saldo, int qtdeCheques){
        super(agencia, conta, saldo); //Chama o Construtor da Classe Mãe
        this.qtdeCheques = qtdeCheques;
    }

    public boolean emitirCheques(int qtde){
        if ((qtde >0) && (qtde <= qtdeCheques)){
            this.qtdeCheques = this.qtdeCheques - qtde;
            return true;
        }else{
            return false;
        }
    }

}

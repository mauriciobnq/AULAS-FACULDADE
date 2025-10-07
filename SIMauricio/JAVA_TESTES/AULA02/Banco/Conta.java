package Banco;
class Conta {
    public String agencia;
    public String conta;
    public float saldo;
 
    //Construtor sem parâmetros
    Conta() { 
    }
 
    //Construtor passando agência e conta
    Conta(String agencia, String conta) { 
       this.agencia = agencia;
       this.conta = conta;
    }
 
    //Construtor passando agência, conta e saldo
    Conta(String agencia, String conta, float saldo) { 
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
     }
 
    public boolean depositar(float valor) {
        if (valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }else{
            System.out.println("Valor inválido para depósito.");
            return false;
        }
    }

    public boolean sacar(float valor){
        if (valor > 0){
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor;
                return true;
            } else {
                System.out.println("Saldo Insuficiente!");
                return false;
            }
        } else {
            System.out.println("Valor inválido para saque.");
            return false;
        }
    }
        
    public float saldo(){
        return this.saldo;
    }
}
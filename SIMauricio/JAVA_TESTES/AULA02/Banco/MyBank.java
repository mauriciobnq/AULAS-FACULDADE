package Banco;

public class MyBank {
    public static void main(String[] args) {
    
        System.out.println("==== Conta Corrente ====");
        ContaCorrente cntCorr1 = new ContaCorrente("2234-9","558798-7",0.0f,20);
        ContaCorrente cntCorr2 = new ContaCorrente();
        cntCorr2.agencia = "4455-7";
        cntCorr2.conta = "225511-9";
        cntCorr2.saldo = 0.0f;
        System.out.println("Saldo Conta: "+cntCorr2.conta+" = "+cntCorr2.saldo());
        cntCorr2.depositar(200.0f);
        System.out.println("Saldo Conta: "+cntCorr2.conta+" = "+cntCorr2.saldo());
        cntCorr2.sacar(110.0f);
        System.out.println("Saldo Conta: "+cntCorr2.conta+" = "+cntCorr2.saldo());
        cntCorr2.sacar(100.0f);

        System.out.println("==== Conta Poupança ====");
        ContaPoupanca cntPoup = new ContaPoupanca("2222-3","444444-5",0.0f);
        System.out.println("Saldo Conta: "+cntPoup.conta+" = "+cntPoup.saldo());
        cntPoup.depositar(1000.00f);
        System.out.println("Saldo Conta: "+cntPoup.conta+" = "+cntPoup.saldo());
        cntPoup.lancarJuros(0.5f); //Em porcentagem 0.5%
        System.out.println("Saldo Conta: "+cntPoup.conta+" = "+cntPoup.saldo());

        System.out.println("==== Conta Salario ====");
        ContaSalario cntSal = new ContaSalario("8888-9", "22222-3", 0.0f);
        cntSal.lancarPgto(5000.0f);
        System.out.println("Saldo Conta: "+cntSal.conta+" = "+cntSal.saldo());
        
        cntSal.depositar(500.0f);
        System.out.println("Saldo Conta: "+cntSal.conta+" = "+cntSal.saldo());
    }    
}

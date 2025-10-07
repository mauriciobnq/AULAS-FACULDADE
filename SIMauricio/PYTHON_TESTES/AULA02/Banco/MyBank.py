from ContaCorrente import ContaCorrente
from ContaPoupanca import ContaPoupanca
from ContaSalario import ContaSalario

class MyBank:

    print("==== Conta Corrente ====")
    cntCorr = ContaCorrente("2234-9","558798-7",0.0,20)
    print(f'Saldo Conta {cntCorr.conta}: {cntCorr.verSaldo()}')
    cntCorr.depositar(200.0)
    print(f'Saldo Conta {cntCorr.conta}: {cntCorr.verSaldo()}')
    cntCorr.sacar(110.0)
    print(f'Saldo Conta {cntCorr.conta}: {cntCorr.verSaldo()}')
    cntCorr.sacar(100.0)

    print("==== Conta Poupança ====")
    cntPoup = ContaPoupanca("2222-3","444444-5",0.0)
    print(f'Saldo Conta {cntPoup.conta}: {cntPoup.verSaldo()}')
    cntPoup.depositar(1000.00)
    print(f'Saldo Conta {cntPoup.conta}: {cntPoup.verSaldo()}')
    cntPoup.lancarJuros(0.5) #Em porcentagem 0.5%
    print(f'Saldo Conta {cntPoup.conta}: {cntPoup.verSaldo()}')
    
    print("==== Conta Salário ====")
    cntSal = ContaSalario("2222-3","444444-5",0.0)
    print(f'Saldo Conta {cntSal.conta}: {cntSal.verSaldo()}')
    cntSal.lancarPgto(5000.0)
    print(f'Saldo Conta {cntSal.conta}: {cntSal.verSaldo()}')

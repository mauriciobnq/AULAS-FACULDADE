class Conta:
    def __init__(self, agencia, nro, tipo, saldo=0.0):
        self.agencia = agencia
        self.nro = nro
        self.tipo = tipo
        self.saldo = saldo

    def depositar(self, valor):
        if (valor > 0):
            self.saldo = self.saldo + valor
            return True
        else:
            print("Valor inválido para depósito.")
            return False
    
    def sacar(self, valor):
        if (valor > 0): 
            if (valor <= self.saldo):
                self.saldo = self.saldo - valor
                return True   
            else:
                print("Saldo Insuficiente!")
                return False
        else:
            print("Valor inválido para saque.")
            return False
        
    def consultarSaldo(self):
        return self.saldo

#Programa Principal
cnt1 = Conta("2345","9876-2",1)
print(cnt1.consultarSaldo())
cnt1.depositar(100.0)
print(cnt1.consultarSaldo())
cnt1.sacar(50.0)
print(cnt1.consultarSaldo())
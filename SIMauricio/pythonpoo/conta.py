class Conta:
    def __init__(self, agencia, numero, tipo, saldo=0.0):
        self.agencia = agencia
        self.numero = numero
        self.tipo = tipo
        self.saldo = saldo

    def depositar(self, valor):
        if (valor >0):
            self.saldo = self.saldo + valor
            return True
        
        else: 
            print("Valor inválido para depósito.")
            return False
        
    def sacar(self, valor):
        if(valor >0):  
            if (valor <= self.saldo):
                self.saldo = self.saldo - valor
                return True
            else:
                print("Saldo insuficiente.")
                return False

        else:
            print("Valor inválido para saque.")
            return False

    def consultarSaldo(self):
        return self.saldo
    
# Programa Principal    
    
cnt1 = Conta(1234, 4567-8,1)
print(cnt1.consultarSaldo())
cnt1.depositar(100.00)
print(cnt1.consultarSaldo())
cnt1.sacar(50.00)
print(cnt1.consultarSaldo())

class Conta:
    def __init__(self, agencia, conta, saldo):
        self.agencia = agencia
        self.conta = conta
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
        
    def verSaldo(self):
        return self.saldo

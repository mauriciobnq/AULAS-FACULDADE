from Conta import Conta
class ContaPoupanca(Conta):
    def __init__(self, agencia, conta, saldo):
        super().__init__(agencia, conta, saldo)

    def lancarJuros(self, taxaJuros):
        if (taxaJuros >0.0):
            self.saldo = self.saldo + (self.saldo*(taxaJuros/100))

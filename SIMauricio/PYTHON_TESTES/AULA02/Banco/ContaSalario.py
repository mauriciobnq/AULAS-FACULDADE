from Conta import Conta
class ContaSalario(Conta):
    def __init__(self, agencia, conta, saldo):
        super().__init__(agencia, conta, saldo)

    def lancarPgto(self, valor):
        if (valor >0.0):
            self.saldo = self.saldo + valor
        else:
            print('Valor inválido!')

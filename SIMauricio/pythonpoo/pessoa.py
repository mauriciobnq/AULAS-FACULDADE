class Pessoa:
    def __init__(self, nome=None, cpf=None, endereco=None, fone=None, idade=None):
        self.nome = nome
        self.cpf = cpf
        self.endereco = endereco
        self.fone = fone
        self.idade = idade

    def salvar(self):
        #Validar os dados e salvar
        print("Salvando dados da Pessoa ...")
        return True
    
    def editar(self):
        #solicitar as novas informações
        print("Editando Dados da Pessoa...")
        return True
    
    def validarCPF(self):
        #executar o algoritmo de validação do CPF
        print("Validando CPF ...")
        return True

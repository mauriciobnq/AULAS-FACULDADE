class Livro:
    def __init__(self, titulo=None, autor=None, editora=None, anoPublicacao=None, preco=None):
        self.titulo = titulo
        self.autor = autor
        self.editora = editora
        self.anoPublicacao = anoPublicacao
        self.preco = preco

    def salvar(self):
        #Validar os dados e salvar
        print("Salvando dados do Livro...")
        return True
    
    def editar(self):
        #solicitar as novas informações
        print("Editando Dados do Livro...")
        return True
    
    def exibir(self):
        print("-------- Dados do Livro: ----------")
        print(f"Título: {self.titulo}")
        print(f"Autor: {self.autor}")
        print(f"Editora: {self.editora}")
        print(f"Ano de Publicacao: {self.anoPublicacao}")
        print(f"Preço: {self.preco}")

    def __del__(self):
        print("Executando o Destrutor da Classe...")
        return True

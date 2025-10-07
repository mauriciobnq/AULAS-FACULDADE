import pessoa
from livro import Livro

pessoa1 = pessoa.Pessoa("Maria","089.776.342-15","Rua 1, nro 2","(17)98776 6739",25)
pessoa1 = pessoa.Pessoa()

pessoa1.salvar()
pessoa1.editar()

livro1 = Livro("Python na Prática","José Flores","Editora das Almas",2025,125.50);
livro1.exibir()
livro1.salvar()
livro1.editar()

livro2 = Livro("Java na Prática");
livro2.autor = "João Silva"
livro2.preco = 90.5
livro2.exibir()
livro2.salvar()
livro2.editar()

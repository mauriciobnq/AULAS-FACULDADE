package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> Livros = new ArrayList<>();
    private List<Autor> Autores = new ArrayList<>();
    private List<Usuario> Usuarios = new ArrayList<>();
    private List<Emprestimo> Emprestimos = new ArrayList<>();
    private List<LivroAutor> LivroAutores = new ArrayList<>();
    

    private boolean existeLivroComId(int id){
        for (Livro livro : Livros) {
            if(livro.getId() == id){
                return true;
            }
        }
        return false;
    }
    private boolean existeLivroComIsbn(String isbn){
        for (Livro livro : Livros) {
            if(livro.getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }

    public List<Livro> getAll(){
        return this.Livros;
    }

    public void adicionarLivro(Livro livro){
        if(existeLivroComId(livro.getId())){
            throw new IllegalArgumentException("ID já cadastrado !");    
        }

        if(existeLivroComIsbn(livro.getIsbn())){
            throw new IllegalArgumentException("ISBN já cadastrado !");    
        }

        this.Livros.add(livro);
    }    
}

package Biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private int ano;
    private String editora;
    private String isbn;
    private boolean disponivel;

    public Livro(int id, String titulo, int ano, String editora, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean emprestar(){
        if (this.isDisponivel()){
            this.disponivel = false;
            return true;
        }else{
            return false;
        }   
    }

    public boolean devolver(){
        if (this.isDisponivel()){
            this.disponivel = true;
            return true;
        }else{
            return false;
        }
    }
}
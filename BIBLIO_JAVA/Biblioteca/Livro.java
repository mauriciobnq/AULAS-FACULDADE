package Biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private int ano;
    private String editora;
    private String isbn;
    private boolean disponivel;

    public boolean isDisponivel(){
        return this.disponivel;
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
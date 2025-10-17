package Biblioteca;

abstract public class Usuario {
    private int id;
    private String nome;
    private String email;

    public abstract int getLimiteLivros();

    public abstract int getPrazoEmprestimo();
}

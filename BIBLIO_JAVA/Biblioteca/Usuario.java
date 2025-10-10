package Biblioteca;

abstract public class Usuario {
    private int id;
    private String nome;
    private String email;
    private int limiteEmp;

    public int getLimiteLivros(){
        return this.limiteEmp;
    }
    
}

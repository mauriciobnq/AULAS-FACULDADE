package Biblioteca;

public class Funcionario extends Usuario {
    private String matricula;
    private String dpto;
 
    @Override 
    public int getLimiteLivros(){
        return 4;
    }
    
    @Override 
    public int getPrazoEmprestimo(){
        return 4;
    }
}

package Biblioteca;

public class Professor extends Usuario{
    private String matricula;
    private String area;
    
    @Override 
    public int getLimiteLivros(){
        return 5;
    }
    
    @Override 
    public int getPrazoEmprestimo(){
        return 5;
    }
}

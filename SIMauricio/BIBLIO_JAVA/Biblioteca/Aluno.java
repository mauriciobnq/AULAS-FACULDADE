package Biblioteca;

public class Aluno extends Usuario {
    private String ra;
    private String curso;
   
    @Override 
    public int getLimiteLivros(){
        return 3;
    }
    
    @Override 
    public int getPrazoEmprestimo(){
        return 3;
    }
}

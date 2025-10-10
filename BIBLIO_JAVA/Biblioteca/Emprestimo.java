package Biblioteca;

import java.util.Date;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public boolean registrarDevolucao(Date data){
        if (data.equals(this.dataEmprestimo) || data.after(this.dataEmprestimo)) {
            this.dataDevolucao = data;
            return true;
        }else {
            return false;
        }
    }    
}

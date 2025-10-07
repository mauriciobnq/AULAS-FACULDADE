
public class Livraria {

    public static void main(String[] args) {
    
        Pessoa pessoa1 = new Pessoa();
        pessoa1.salvar();
        pessoa1.editar();
        pessoa1.validarCPF();

        Livro livro1 = new Livro("Python na Prática","José Flores","Editora das Almas",2025,125.5f);
        livro1.salvar();
        livro1.editar();
    
    }
    
}

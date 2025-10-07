public class Livro {
    String titulo;
    String autor;
    String editora;
    int anoPublicacao;
    float preco;

    //Contrutor que NÃO recebe Parâmetros
    Livro(){

    }

    //Contrutor que RECEBE as informações por Parâmetro e atribui para os Atributos
    Livro(String titulo, String autor, String editora, int anoPublicacao, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    boolean salvar(){
        //Validar os dados e salvar
        System.out.println("Salvando dados do Livro ...");
        return true;
    }
    
    boolean editar(){
        //solicitar as novas informações
        System.out.println("Editando Dados do Livro ...");
        return true;
    }    

  
}

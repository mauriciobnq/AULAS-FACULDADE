class Pessoa {
    String nome;
    String cpf;
    String endereco;
    String fone;
    int idade;

    boolean salvar() {
        // Validar os dados e salvar
        System.out.println("Salvando dados da Pessoa ...");
        return true;
    }

    boolean editar() {
        // solicitar as novas informações
        System.out.println("Editando Dados da Pessoa ...");
        return true;
    }

    boolean validarCPF() {
        // executar o algoritmo de validação do CPF
        System.out.println("Validando CPF ...");
        return true;
    }

}
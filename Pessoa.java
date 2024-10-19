public class Pessoa {
    private String nome;
    private String CPF;
    private String email;
    private Endereco endereco;
    private Telefone telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public static boolean validarCPF(String CPF) {
        if (CPF == null || CPF.length() != 11) {
            System.out.printf("Digite um cpf valido!");
            return false;

        }
        if (CPF.chars().distinct().count() == 1) {
            System.out.printf("Digite um cpf valido!");
            return false;


        } else {

            return true;
        }

    }
    public void imprimirPessoa(){
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+CPF);
        System.out.println("email: "+email);
        System.out.println("endereço: "+endereco.getLogradouro()+","+ endereco.getNumero()+(endereco.getComplemento().isEmpty()? "":","+endereco.getComplemento())+","+ endereco.getBairro()+","+ endereco.getCidade()+"-"+endereco.getEstado()+", CEP: "+endereco.getCep());
        System.out.println("Telefone: ("+telefone.getDdd()+") " +telefone.getNumero());

    }
}

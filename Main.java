import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa =new Pessoa();
        System.out.println("INFORME OS DADOS DA PESSOA:");
        System.out.println("nome: ");
        pessoa.setNome(scan.nextLine());
        String CPF;
        for(int i=0;i<1;i++)
            while(true){
                System.out.println("CPF: ");
                CPF=scan.nextLine();
                pessoa.setCpf(CPF);
                if(Pessoa.validarCPF(CPF)){
                    i=1;
                    break;

            }
                else{
                    System.out.println("CPF INVALIDO");
            }
        }

        System.out.println("email: ");
        pessoa.setEmail(scan.nextLine());

        Endereco endreco=new Endereco();
        System.out.println("CEP: ");
        endreco.setCep(scan.nextLine());
        System.out.println("logradouro: ");
        endreco.setLogradouro(scan.nextLine());
        System.out.println("Número: ");
        endreco.setNumero(scan.nextLine());
        System.out.println("complemento: ");
        endreco.setComplemento(scan.nextLine());
        System.out.println("bairro: ");
        endreco.setBairro(scan.nextLine());
        System.out.println("cidade");
        endreco.setCidade(scan.nextLine());
        System.out.println("estado:");
        endreco.setEstado(scan.nextLine());
        pessoa.setEndereco(endreco);

        System.out.println("DDD do telefone: ");
        String ddd=scan.nextLine();
        System.out.println("Número de telefone: ");
        String numero=scan.nextLine();
        Telefone telefone=new Telefone(ddd,numero);
        pessoa.setTelefone(telefone);

        System.out.println("\nDados da pessoa cadastrada;");
        pessoa.imprimirPessoa();

    }
}

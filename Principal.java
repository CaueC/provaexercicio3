public class Principal {
    
    public static void main(String []args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoafisica = new PessoaFisica();
        PessoaJuridica pessoajuridica = new PessoaJuridica();

        pessoa.setNome("Caue");
        pessoa.setEndereco("Aeroporto");
        pessoafisica.setCPF("528.852.448-36");
        pessoajuridica.setCNPJ("30.420.560/0001-32");
        

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Endereco: " + pessoa.endereco);
        System.out.println("CPF: " + pessoafisica.CPF);
        System.out.println("CNPJ: " + pessoajuridica.CNPJ);

    }
}

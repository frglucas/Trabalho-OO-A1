package ex6;

public class Program {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Av.Presidente Getúlio Vargas");
        endereco.setComplemento("Loja 1");
        endereco.setNumero(5158);
        endereco.setCep("94836-000");

        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome("Lucas");
        pessoaUm.setSexo('M');
        pessoaUm.setIdade(20);
        pessoaUm.setEnd(endereco);

        Pessoa pessoaDois = new Pessoa("Alexandre", 46, 'M');

        System.out.println(endereco);
        System.out.println(pessoaUm);
        System.out.println(pessoaDois);

    }
}

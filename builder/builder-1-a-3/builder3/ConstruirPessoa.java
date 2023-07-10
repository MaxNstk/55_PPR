package builder3;

import builder3.produto.Pessoa;


// o builder tem o produto e reseta e retorna ele,
// alem de construir todos o satributos do mesmo, que chama o set do próprio produto;

public class ConstruirPessoa {

    private Pessoa pessoa;

    public Pessoa getPessoa(){
        return pessoa;
    }

    public void reset(){
        this.pessoa = new Pessoa();
    }

    public void construirNome(String nome){
        this.pessoa.setNome(nome);
    }
    public void construirEndereco(String endereco){
        this.pessoa.setEndereco(endereco);
    }
    public void construirTelefone(String telefone){
        this.pessoa.setTelefone(telefone);
    }

    public void construirEmail(String email) {
        this.pessoa.setEmail(email);
    }
}

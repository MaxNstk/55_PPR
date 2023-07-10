package builder3.produto;

import builder3.ConstruirPessoa;

import java.util.HashMap;
import java.util.Map;

// recebe o builder e constroi o objeto
public class Director {

    public final static String NOME="nome";
    public final static String ENDERECO="endereco";
    public final static String TELEFONE="telefone";
    public final static String EMAIL="email";

    private ConstruirPessoa pessoaBuilder;

    public Director(ConstruirPessoa pessoaBuilder){
        this.pessoaBuilder = pessoaBuilder;
    }

    public void construir(Map<String,String> params){
        this.pessoaBuilder.reset();
        this.pessoaBuilder.construirNome(params.get(NOME));
        this.pessoaBuilder.construirEndereco(params.get(ENDERECO));
        this.pessoaBuilder.construirTelefone(params.get(TELEFONE));
        this.pessoaBuilder.construirEmail(params.get(TELEFONE));
    }
}

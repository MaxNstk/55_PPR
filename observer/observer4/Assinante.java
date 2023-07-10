public class Assinante implements Observer {
    private String nome;
    private String endereco;

    public Assinante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public void receberEdicao(Edicao edicao) {
        System.out.println(nome+" recebeu a edição: "+String.valueOf(edicao.getNumero())+" da revista "+edicao.getRevista());
    }
}

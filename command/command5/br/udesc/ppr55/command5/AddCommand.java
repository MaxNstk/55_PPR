package br.udesc.ppr55.command5;

public class AddCommand implements Command {

    int opMusica;
    CarrinhoCompras cc;

    public AddCommand(int opMusica, CarrinhoCompras cc) {
        this.opMusica = opMusica;
        this.cc = cc;
    }

    @Override
    public void execute() {
        Musica musica = BancoMusicas.getInstancia().getMusicas().get(opMusica);
        cc.add(musica);
    }

    @Override
    public void undo() {
    }

    @Override
    public void redo() {

    }
}

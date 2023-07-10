package br.udesc.ppr55.command5;

public class TamanhoMusicaCommand implements Command {

    Observer obs;
    CarrinhoCompras cc;

    public TamanhoMusicaCommand(Observer obs, CarrinhoCompras cc) {
        this.obs = obs;
        this.cc = cc;
    }

    @Override
    public void execute() {
        int tamTotal = 0;
        for (Musica mus:cc.getProdutos()) {
            tamTotal += mus.getTamanho();
        }
        obs.imprimir("> " + tamTotal + " MB");
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}

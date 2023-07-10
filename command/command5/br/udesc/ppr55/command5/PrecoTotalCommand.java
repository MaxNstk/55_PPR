package br.udesc.ppr55.command5;

public class PrecoTotalCommand implements Command {

    Observer obs;
    CarrinhoCompras cc;

    public PrecoTotalCommand(Observer obs, CarrinhoCompras cc) {
        this.obs = obs;
        this.cc = cc;
    }

    @Override
    public void execute() {
        float precoTotal = 0;
        for (Musica mus:cc.getProdutos()) {
            precoTotal += mus.getPreco();
        }
        obs.imprimir("> R$ " + precoTotal);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}

package br.udesc.ppr55.command5;

public class ListarCommand implements Command {

    Observer obs;
    CarrinhoCompras cc;

    public ListarCommand(Observer obs, CarrinhoCompras cc) {
        this.obs = obs;
        this.cc = cc;
    }

    @Override
    public void execute() {
        obs.listandoMusicas(cc.getProdutos());
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}

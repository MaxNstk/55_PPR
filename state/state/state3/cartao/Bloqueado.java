package state3.cartao;

public class Bloqueado extends CartaoEstado {

    @Override
    public void entrarPin(String pin) throws Exception {
        throw new Exception("bloqueado");
    }

    @Override
    public void fazerPagamento() throws Exception {
        throw new Exception("bloqueado");
    }
}

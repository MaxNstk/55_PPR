package builder2.builder;

import builder2.produto.Boleto;

public class CaixaBuilder extends Banco{

    @Override
    public void construirCedente(String cedente) {
        super.construirCedente(cedente.toUpperCase());
    }
}

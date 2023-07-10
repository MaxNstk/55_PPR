package builder2.builder;

import builder2.produto.Boleto;

public class BradescoBuilder extends Banco{

    @Override
    public void construirCarteira(String carteira) {
        super.construirCarteira("06");
    }
}

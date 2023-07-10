package tmFm.control;

import tmFm.model.*;

public class MovimentoHeroiAgua extends MovimentoHeroi{

    @Override
    protected Heroi criarPeca() {
        return new HeroiAgua();
    }

    @Override
    protected boolean validarOutrosTiposCasas(Peca peca) {
        return peca.getClass() == Agua.class;
    }
}

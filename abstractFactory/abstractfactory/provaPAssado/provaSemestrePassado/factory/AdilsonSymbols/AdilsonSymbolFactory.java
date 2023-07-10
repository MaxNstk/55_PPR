package factory.AdilsonSymbols;

import factory.Symbol;
import factory.SymbolFactory;

public class AdilsonSymbolFactory extends SymbolFactory {
    @Override
    public Symbol[] getSymbols() {
        return new Symbol[]{Triangulo.getInstance(), Estrela.getInstance(), };
    }

    @Override
    public Symbol criarFig1() {
        return Triangulo.getInstance();
    }

    @Override
    public Symbol criarFig2() {
        return Estrela.getInstance();
    }

    @Override
    public Symbol criarFig3() {
        return Retangulo.getInstance();
    }
}

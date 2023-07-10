package factory.defaultAulaSymbols;

import factory.Symbol;
import factory.SymbolFactory;

public class DefaultSymbolFactory extends SymbolFactory {
    @Override
    public Symbol[] getSymbols() {
        return new Symbol[]{Oval.getInstance(), Diamond.getInstance(), Squiggle.getInstance()};
    }

    @Override
    public Symbol criarFig1() {
        return Oval.getInstance();
    }

    @Override
    public Symbol criarFig2() {
        return Diamond.getInstance();
    }

    @Override
    public Symbol criarFig3() {
        return Squiggle.getInstance();
    }
}

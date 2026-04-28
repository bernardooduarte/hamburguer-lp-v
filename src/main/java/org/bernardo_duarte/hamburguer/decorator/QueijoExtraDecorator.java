package org.bernardo_duarte.hamburguer.decorator;

public class QueijoExtraDecorator extends AdicionalDecorator {
    public QueijoExtraDecorator(HamburguerMontavel hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", queijo extra";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 3.50;
    }
}

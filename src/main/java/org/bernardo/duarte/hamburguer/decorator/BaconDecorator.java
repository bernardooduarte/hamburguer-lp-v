package org.bernardo.duarte.hamburguer.decorator;

public class BaconDecorator extends AdicionalDecorator {
    public BaconDecorator(HamburguerMontavel hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", bacon";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 4.20;
    }
}

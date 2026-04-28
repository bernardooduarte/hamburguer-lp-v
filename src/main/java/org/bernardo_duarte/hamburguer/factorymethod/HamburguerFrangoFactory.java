package org.bernardo_duarte.hamburguer.factorymethod;

public class HamburguerFrangoFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerFrango();
    }
}

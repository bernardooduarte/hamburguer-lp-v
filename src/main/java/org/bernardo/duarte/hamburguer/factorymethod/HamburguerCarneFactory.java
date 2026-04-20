package org.bernardo.duarte.hamburguer.factorymethod;

public class HamburguerCarneFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerCarne();
    }
}

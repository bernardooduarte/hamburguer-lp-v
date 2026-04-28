package org.bernardo_duarte.hamburguer.factorymethod;

public class HamburguerVegetarianoFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerVegetariano();
    }
}

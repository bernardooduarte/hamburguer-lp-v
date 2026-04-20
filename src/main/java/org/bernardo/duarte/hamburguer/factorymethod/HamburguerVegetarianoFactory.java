package org.bernardo.duarte.hamburguer.factorymethod;

public class HamburguerVegetarianoFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerVegetariano();
    }
}

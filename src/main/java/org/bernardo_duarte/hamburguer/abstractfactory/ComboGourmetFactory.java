package org.bernardo_duarte.hamburguer.abstractfactory;

import org.bernardo_duarte.hamburguer.factorymethod.Hamburguer;
import org.bernardo_duarte.hamburguer.factorymethod.HamburguerCarneFactory;
import org.bernardo_duarte.hamburguer.factorymethod.HamburguerFactory;

public class ComboGourmetFactory implements ComboFactory {
    private final HamburguerFactory hamburguerFactory = new HamburguerCarneFactory();

    @Override
    public Hamburguer criarHamburguer() {
        return hamburguerFactory.criarHamburguer();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new BatataRustica();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new Brownie();
    }
}

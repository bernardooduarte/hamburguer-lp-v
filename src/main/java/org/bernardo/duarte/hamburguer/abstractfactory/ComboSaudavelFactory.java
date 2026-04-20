package org.bernardo.duarte.hamburguer.abstractfactory;

import org.bernardo.duarte.hamburguer.factorymethod.Hamburguer;
import org.bernardo.duarte.hamburguer.factorymethod.HamburguerFactory;
import org.bernardo.duarte.hamburguer.factorymethod.HamburguerVegetarianoFactory;

public class ComboSaudavelFactory implements ComboFactory {
    private final HamburguerFactory hamburguerFactory = new HamburguerVegetarianoFactory();

    @Override
    public Hamburguer criarHamburguer() {
        return hamburguerFactory.criarHamburguer();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new SaladaVerde();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new FrutaCortada();
    }
}

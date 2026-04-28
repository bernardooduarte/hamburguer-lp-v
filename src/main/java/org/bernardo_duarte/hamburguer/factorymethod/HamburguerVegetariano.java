package org.bernardo_duarte.hamburguer.factorymethod;

public class HamburguerVegetariano implements Hamburguer {
    @Override
    public String getNome() {
        return "Hamburguer Vegetariano";
    }

    @Override
    public double getPreco() {
        return 21.50;
    }
}

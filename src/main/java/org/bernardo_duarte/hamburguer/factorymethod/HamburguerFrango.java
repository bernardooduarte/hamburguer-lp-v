package org.bernardo_duarte.hamburguer.factorymethod;

public class HamburguerFrango implements Hamburguer {
    @Override
    public String getNome() {
        return "Hamburguer de Frango";
    }

    @Override
    public double getPreco() {
        return 22.90;
    }
}

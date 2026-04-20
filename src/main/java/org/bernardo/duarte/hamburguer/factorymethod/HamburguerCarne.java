package org.bernardo.duarte.hamburguer.factorymethod;

public class HamburguerCarne implements Hamburguer {
    @Override
    public String getNome() {
        return "Hamburguer de Carne";
    }

    @Override
    public double getPreco() {
        return 24.90;
    }
}

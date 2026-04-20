package org.bernardo.duarte.hamburguer.abstractfactory;

public class Brownie implements Sobremesa {
    @Override
    public String getNome() {
        return "Brownie";
    }

    @Override
    public double getPreco() {
        return 11.90;
    }
}

package org.bernardo.duarte.hamburguer.abstractfactory;

public class FrutaCortada implements Sobremesa {
    @Override
    public String getNome() {
        return "Fruta Cortada";
    }

    @Override
    public double getPreco() {
        return 7.40;
    }
}

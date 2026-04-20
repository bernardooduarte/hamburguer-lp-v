package org.bernardo.duarte.hamburguer.abstractfactory;

public class SaladaVerde implements Acompanhamento {
    @Override
    public String getNome() {
        return "Salada Verde";
    }

    @Override
    public double getPreco() {
        return 8.50;
    }
}

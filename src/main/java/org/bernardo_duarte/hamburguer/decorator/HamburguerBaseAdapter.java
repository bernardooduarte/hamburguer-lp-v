package org.bernardo_duarte.hamburguer.decorator;

import org.bernardo_duarte.hamburguer.factorymethod.Hamburguer;

public class HamburguerBaseAdapter implements HamburguerMontavel {
    private final Hamburguer hamburguer;

    public HamburguerBaseAdapter(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    @Override
    public String getDescricao() {
        return hamburguer.getNome();
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco();
    }
}

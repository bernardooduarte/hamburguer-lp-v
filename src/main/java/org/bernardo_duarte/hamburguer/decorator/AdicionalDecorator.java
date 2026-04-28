package org.bernardo_duarte.hamburguer.decorator;

public abstract class AdicionalDecorator implements HamburguerMontavel {
    protected final HamburguerMontavel hamburguer;

    protected AdicionalDecorator(HamburguerMontavel hamburguer) {
        this.hamburguer = hamburguer;
    }
}

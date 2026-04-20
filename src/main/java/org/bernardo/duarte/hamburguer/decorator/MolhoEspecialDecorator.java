package org.bernardo.duarte.hamburguer.decorator;

public class MolhoEspecialDecorator extends AdicionalDecorator {
    public MolhoEspecialDecorator(HamburguerMontavel hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", molho especial";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 2.30;
    }
}

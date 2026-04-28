package org.bernardo_duarte.hamburguer.abstractfactory;

public class BatataRustica implements Acompanhamento {
    @Override
    public String getNome() {
        return "Batata Rustica";
    }

    @Override
    public double getPreco() {
        return 9.90;
    }
}

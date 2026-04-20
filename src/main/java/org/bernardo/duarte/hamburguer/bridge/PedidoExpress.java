package org.bernardo.duarte.hamburguer.bridge;

import org.bernardo.duarte.hamburguer.abstractfactory.Combo;

public class PedidoExpress extends PedidoBridge {
    private final double taxaExpress;

    public PedidoExpress(Combo combo, CanalVenda canalVenda, double taxaExpress) {
        super(combo, canalVenda);
        this.taxaExpress = taxaExpress;
    }

    @Override
    protected double calcularValorFinal() {
        return combo.getPrecoTotal() + taxaExpress;
    }
}

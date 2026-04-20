package org.bernardo.duarte.hamburguer.bridge;

import org.bernardo.duarte.hamburguer.abstractfactory.Combo;

public class PedidoPadrao extends PedidoBridge {
    public PedidoPadrao(Combo combo, CanalVenda canalVenda) {
        super(combo, canalVenda);
    }

    @Override
    protected double calcularValorFinal() {
        return combo.getPrecoTotal();
    }
}

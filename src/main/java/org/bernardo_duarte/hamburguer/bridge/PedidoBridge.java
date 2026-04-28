package org.bernardo_duarte.hamburguer.bridge;

import org.bernardo_duarte.hamburguer.abstractfactory.Combo;

public abstract class PedidoBridge {
    protected final Combo combo;
    protected final CanalVenda canalVenda;

    protected PedidoBridge(Combo combo, CanalVenda canalVenda) {
        this.combo = combo;
        this.canalVenda = canalVenda;
    }

    protected abstract double calcularValorFinal();

    public String fecharPedido() {
        return canalVenda.processar(combo.descricao(), calcularValorFinal());
    }
}

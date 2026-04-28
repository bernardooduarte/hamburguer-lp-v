package org.bernardo_duarte.hamburguer.bridge;

import org.bernardo_duarte.hamburguer.abstractfactory.Combo;
import org.bernardo_duarte.hamburguer.abstractfactory.ComboFactory;
import org.bernardo_duarte.hamburguer.abstractfactory.ComboGourmetFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BridgeTest {

    @Test
    void pedidoPadraoDeveUsarCanalBalcao() {
        ComboFactory factory = new ComboGourmetFactory();
        Combo combo = Combo.criar(factory);
        PedidoBridge pedido = new PedidoPadrao(combo, new CanalBalcao());

        String resultado = pedido.fecharPedido();

        assertTrue(resultado.contains("Pedido no balcao"));
        assertTrue(resultado.contains("Hamburguer de Carne + Batata Rustica + Brownie"));
    }

    @Test
    void pedidoExpressDeveAplicarTaxaNoDelivery() {
        ComboFactory factory = new ComboGourmetFactory();
        Combo combo = Combo.criar(factory);
        PedidoBridge pedido = new PedidoExpress(combo, new CanalDelivery(), 5.0);

        String resultado = pedido.fecharPedido();

        assertTrue(resultado.contains("Pedido para delivery"));
        assertTrue(resultado.contains("51.70"));
    }
}

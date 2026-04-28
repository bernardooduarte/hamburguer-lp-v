package org.bernardo_duarte.hamburguer.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

    @Test
    void deveAvancarPedidoAteEntrega() {
        Pedido pedido = new Pedido();

        assertEquals("Novo", pedido.getStatus());

        pedido.preparar();
        assertEquals("Preparando", pedido.getStatus());

        pedido.finalizar();
        assertEquals("Pronto", pedido.getStatus());

        pedido.entregar();
        assertEquals("Entregue", pedido.getStatus());
    }

    @Test
    void naoDevePularEstadoInicial() {
        Pedido pedido = new Pedido();

        pedido.entregar();

        assertEquals("Novo", pedido.getStatus());
    }
}
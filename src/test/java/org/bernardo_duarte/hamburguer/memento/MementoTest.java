package org.bernardo_duarte.hamburguer.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MementoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());

        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());

        pedido.restauraEstado(0);

        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());

        pedido.restauraEstado(2);

        assertEquals(PedidoEstadoPronto.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        Pedido pedido = new Pedido();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> pedido.restauraEstado(0));

        assertEquals("Indice invalido", exception.getMessage());
    }
}

package org.bernardo_duarte.hamburguer.chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChainOfResponsabilityTest {

    @Test
    void deveEncaminharPedidoParaOClienteCorreto() {
        Cliente atendente = new ClienteAtendente();
        Cliente gerente = new ClienteGerente();
        Cliente chef = new ClienteChef();

        atendente.setCliente(gerente);
        gerente.setCliente(chef);

        assertEquals("Pedido simples de hamburguer atendido no balcao", atendente.fazerPedido(new Pedido(TipoPedidoHamburguer.SIMPLES)));
        assertEquals("Combo completo de hamburguer aprovado pelo gerente", atendente.fazerPedido(new Pedido(TipoPedidoHamburguer.COMBO)));
        assertEquals("Hamburguer gourmet liberado pelo chef", atendente.fazerPedido(new Pedido(TipoPedidoHamburguer.GOURMET)));
        assertEquals("Sem assinatura", atendente.fazerPedido(new Pedido(TipoPedidoHamburguer.BEBIDA)));
    }
}
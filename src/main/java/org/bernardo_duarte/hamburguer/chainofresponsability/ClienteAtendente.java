package org.bernardo_duarte.hamburguer.chainofresponsability;

public class ClienteAtendente extends Cliente {
    public ClienteAtendente() {
        listaPedidos.add(TipoPedidoHamburguer.SIMPLES);
    }

    @Override
    public String getDescricaoPedido() {
        return "Pedido simples de hamburguer atendido no balcao";
    }
}
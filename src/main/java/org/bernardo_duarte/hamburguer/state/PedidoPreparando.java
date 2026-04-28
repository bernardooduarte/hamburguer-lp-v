package org.bernardo_duarte.hamburguer.state;

public class PedidoPreparando implements EstadoPedido {
    @Override
    public EstadoPedido preparar(Pedido pedido) {
        return this;
    }

    @Override
    public EstadoPedido finalizar(Pedido pedido) {
        return new PedidoPronto();
    }

    @Override
    public EstadoPedido entregar(Pedido pedido) {
        return this;
    }

    @Override
    public String getStatus() {
        return "Preparando";
    }
}
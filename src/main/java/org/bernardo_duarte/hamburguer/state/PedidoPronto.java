package org.bernardo_duarte.hamburguer.state;

public class PedidoPronto implements EstadoPedido {
    @Override
    public EstadoPedido preparar(Pedido pedido) {
        return this;
    }

    @Override
    public EstadoPedido finalizar(Pedido pedido) {
        return this;
    }

    @Override
    public EstadoPedido entregar(Pedido pedido) {
        return new PedidoEntregue();
    }

    @Override
    public String getStatus() {
        return "Pronto";
    }
}
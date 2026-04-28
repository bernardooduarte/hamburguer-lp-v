package org.bernardo_duarte.hamburguer.state;

public class PedidoNovo implements EstadoPedido {
    @Override
    public EstadoPedido preparar(Pedido pedido) {
        return new PedidoPreparando();
    }

    @Override
    public EstadoPedido finalizar(Pedido pedido) {
        return this;
    }

    @Override
    public EstadoPedido entregar(Pedido pedido) {
        return this;
    }

    @Override
    public String getStatus() {
        return "Novo";
    }
}
package org.bernardo_duarte.hamburguer.state;

public interface EstadoPedido {
    EstadoPedido preparar(Pedido pedido);

    EstadoPedido finalizar(Pedido pedido);

    EstadoPedido entregar(Pedido pedido);

    String getStatus();
}
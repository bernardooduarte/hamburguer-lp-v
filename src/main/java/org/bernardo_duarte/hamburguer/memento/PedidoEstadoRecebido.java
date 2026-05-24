package org.bernardo_duarte.hamburguer.memento;

public class PedidoEstadoRecebido implements EstadoPedido {
    private static final PedidoEstadoRecebido instance = new PedidoEstadoRecebido();

    private PedidoEstadoRecebido() {
    }

    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Recebido";
    }
}

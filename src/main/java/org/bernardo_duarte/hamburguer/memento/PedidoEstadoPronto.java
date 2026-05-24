package org.bernardo_duarte.hamburguer.memento;

public class PedidoEstadoPronto implements EstadoPedido {
    private static final PedidoEstadoPronto instance = new PedidoEstadoPronto();

    private PedidoEstadoPronto() {
    }

    public static PedidoEstadoPronto getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Pronto";
    }
}

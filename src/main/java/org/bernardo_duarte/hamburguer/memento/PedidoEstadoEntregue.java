package org.bernardo_duarte.hamburguer.memento;

public class PedidoEstadoEntregue implements EstadoPedido {
    private static final PedidoEstadoEntregue instance = new PedidoEstadoEntregue();

    private PedidoEstadoEntregue() {
    }

    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}

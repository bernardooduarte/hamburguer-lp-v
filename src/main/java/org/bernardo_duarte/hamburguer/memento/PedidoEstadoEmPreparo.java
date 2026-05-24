package org.bernardo_duarte.hamburguer.memento;

public class PedidoEstadoEmPreparo implements EstadoPedido {
    private static final PedidoEstadoEmPreparo instance = new PedidoEstadoEmPreparo();

    private PedidoEstadoEmPreparo() {
    }

    public static PedidoEstadoEmPreparo getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em preparo";
    }
}

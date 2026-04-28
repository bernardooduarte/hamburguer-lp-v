package org.bernardo_duarte.hamburguer.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected final List<TipoPedido> listaPedidos = new ArrayList<>();
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract String getDescricaoPedido();

    public String fazerPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipoPedido())) {
            return getDescricaoPedido();
        }
        if (cliente != null) {
            return cliente.fazerPedido(pedido);
        }

        return "Sem assinatura";
    }
}

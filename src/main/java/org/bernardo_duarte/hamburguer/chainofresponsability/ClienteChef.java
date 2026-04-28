package org.bernardo_duarte.hamburguer.chainofresponsability;

public class ClienteChef extends Cliente {
    public ClienteChef() {
        listaPedidos.add(TipoPedidoHamburguer.GOURMET);
    }

    @Override
    public String getDescricaoPedido() {
        return "Hamburguer gourmet liberado pelo chef";
    }
}
package org.bernardo_duarte.hamburguer.chainofresponsability;

public class ClienteGerente extends Cliente {
    public ClienteGerente() {
        listaPedidos.add(TipoPedidoHamburguer.COMBO);
    }

    @Override
    public String getDescricaoPedido() {
        return "Combo completo de hamburguer aprovado pelo gerente";
    }
}
package org.bernardo_duarte.hamburguer.chainofresponsability;

public class Pedido {

    private TipoPedido tipoPedido;

    public Pedido(TipoPedido tipoPedido){
        this.tipoPedido = tipoPedido;
    }

    public TipoPedido getTipoPedido(){
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido){
        this.tipoPedido = tipoPedido;
    }
}

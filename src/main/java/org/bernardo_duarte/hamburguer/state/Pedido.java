package org.bernardo_duarte.hamburguer.state;

public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new PedidoNovo();
    }

    public void preparar() {
        estado = estado.preparar(this);
    }

    public void finalizar() {
        estado = estado.finalizar(this);
    }

    public void entregar() {
        estado = estado.entregar(this);
    }

    void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return estado.getStatus();
    }
}
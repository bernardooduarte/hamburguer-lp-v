package org.bernardo_duarte.hamburguer.memento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private EstadoPedido estado;
    private final List<EstadoPedido> memento = new ArrayList<>();

    public EstadoPedido getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Indice invalido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EstadoPedido> getEstados() {
        return this.memento;
    }
}

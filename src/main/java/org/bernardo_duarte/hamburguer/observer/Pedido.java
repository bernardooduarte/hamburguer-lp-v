package org.bernardo_duarte.hamburguer.observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<PedidoObserver> observadores = new ArrayList<>();
    private String status;

    public void adicionarObservador(PedidoObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(PedidoObserver observador) {
        observadores.remove(observador);
    }

    public void alterarStatus(String status) {
        this.status = status;
        notificarObservadores();
    }

    public String getStatus() {
        return status;
    }

    private void notificarObservadores() {
        for (PedidoObserver observador : observadores) {
            observador.atualizar(this);
        }
    }
}
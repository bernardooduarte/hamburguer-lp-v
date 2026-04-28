package org.bernardo_duarte.hamburguer.observer;

import java.util.ArrayList;
import java.util.List;

public class ClienteObserver implements PedidoObserver {
    private final List<String> notificacoes = new ArrayList<>();

    @Override
    public void atualizar(Pedido pedido) {
        notificacoes.add("Cliente avisado: " + pedido.getStatus());
    }

    public List<String> getNotificacoes() {
        return List.copyOf(notificacoes);
    }
}
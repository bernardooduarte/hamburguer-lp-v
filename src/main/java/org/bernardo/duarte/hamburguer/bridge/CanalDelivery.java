package org.bernardo.duarte.hamburguer.bridge;

import java.util.Locale;

public class CanalDelivery implements CanalVenda {
    @Override
    public String processar(String descricaoPedido, double valor) {
        return "Pedido para delivery: " + descricaoPedido + " | Total: R$ " + String.format(Locale.US, "%.2f", valor);
    }
}

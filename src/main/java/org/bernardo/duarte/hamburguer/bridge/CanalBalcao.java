package org.bernardo.duarte.hamburguer.bridge;

import java.util.Locale;

public class CanalBalcao implements CanalVenda {
    @Override
    public String processar(String descricaoPedido, double valor) {
        return "Pedido no balcao: " + descricaoPedido + " | Total: R$ " + String.format(Locale.US, "%.2f", valor);
    }
}

package org.bernardo_duarte.hamburguer.facade;

/**
 * Subsistema - Gerenciador de Entrega
 */
public class GerenciadorEntrega {
    public void agendar(String endereco, String horario) {
        System.out.println("Agendando entrega para " + endereco + " às " + horario);
    }

    public String rastrear(String pedidoId) {
        System.out.println("Rastreando pedido: " + pedidoId);
        return "Pedido em caminho";
    }

    public void confirmar(String pedidoId) {
        System.out.println("Confirmando entrega do pedido: " + pedidoId);
    }
}

package org.bernardo_duarte.hamburguer.facade;

/**
 * Subsistema - Gerenciador de Preparo
 */
public class GerenciadorPreparo {
    public void adicionarNaFila(String pedidoId, String descricao) {
        System.out.println("Adicionando pedido " + pedidoId + " na fila: " + descricao);
    }

    public String obterStatus(String pedidoId) {
        System.out.println("Obtendo status do pedido: " + pedidoId);
        return "Preparando";
    }

    public void marcarPronto(String pedidoId) {
        System.out.println("Pedido " + pedidoId + " marcado como pronto");
    }
}

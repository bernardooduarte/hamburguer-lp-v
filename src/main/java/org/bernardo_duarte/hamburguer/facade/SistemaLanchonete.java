package org.bernardo_duarte.hamburguer.facade;

/**
 * Façade - Interface simplificada para o sistema de lanchonete
 */
public class SistemaLanchonete {
    private GerenciadorEstoque estoque;
    private ProcessadorPagamento pagamento;
    private GerenciadorEntrega entrega;
    private GerenciadorPreparo preparo;

    public SistemaLanchonete() {
        this.estoque = new GerenciadorEstoque();
        this.pagamento = new ProcessadorPagamento();
        this.entrega = new GerenciadorEntrega();
        this.preparo = new GerenciadorPreparo();
    }

    /**
     * Método façade simplificado para realizar um pedido completo
     */
    public boolean realizarPedido(String pedidoId, String descricao, double valor, 
                                   String metodoPagamento, String endereco, String horarioEntrega) {
        System.out.println("========== INICIANDO PEDIDO ==========");
        
        // Verificar estoque
        if (!estoque.verificarDisponibilidade("ingredientes", 1)) {
            System.out.println("Pedido cancelado: Sem estoque disponível");
            return false;
        }
        
        // Processar pagamento
        if (!pagamento.processar(valor, metodoPagamento)) {
            System.out.println("Pedido cancelado: Erro no pagamento");
            return false;
        }
        
        // Registrar saída de ingredientes
        estoque.registrarSaida("ingredientes", 1);
        
        // Adicionar na fila de preparo
        preparo.adicionarNaFila(pedidoId, descricao);
        
        // Agendar entrega
        entrega.agendar(endereco, horarioEntrega);
        
        System.out.println("========== PEDIDO CONFIRMADO ==========\n");
        return true;
    }

    /**
     * Verificar status do pedido
     */
    public String verificarStatus(String pedidoId) {
        String statusPreparo = preparo.obterStatus(pedidoId);
        String statusEntrega = entrega.rastrear(pedidoId);
        
        return "Status Preparo: " + statusPreparo + " | Status Entrega: " + statusEntrega;
    }

    /**
     * Marcar pedido como pronto
     */
    public void marcarPronto(String pedidoId) {
        preparo.marcarPronto(pedidoId);
    }

    /**
     * Confirmar entrega
     */
    public void confirmarEntrega(String pedidoId) {
        entrega.confirmar(pedidoId);
    }
}

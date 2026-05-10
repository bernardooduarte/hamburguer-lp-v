package org.bernardo_duarte.hamburguer.facade;

/**
 * Subsistema - Processador de Pagamento
 */
public class ProcessadorPagamento {
    public boolean processar(double valor, String metodoPagamento) {
        System.out.println("Processando pagamento de R$ " + valor + " via " + metodoPagamento);
        return true; // Simplificado para exemplo
    }

    public double calcularTroco(double valor, double pago) {
        System.out.println("Calculando troco: " + (pago - valor));
        return pago - valor;
    }
}

package org.bernardo_duarte.hamburguer.mediator;

/**
 * Mediator Interface - Define a interface para o mediador
 */
public interface CozinhaMediador {
    void registrarForno(Forno forno);
    void registrarPanela(Panela panela);
    void registrarCaixa(Caixa caixa);
    
    void solicitarPreparo(String itens);
    void notificarPronto(String mensagem);
    void notificarEntrega(String mensagem);
}

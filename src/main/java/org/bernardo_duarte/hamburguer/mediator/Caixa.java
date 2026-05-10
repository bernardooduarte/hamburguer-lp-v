package org.bernardo_duarte.hamburguer.mediator;

/**
 * Colleague - Caixa
 */
public class Caixa {
    private CozinhaMediador mediador;

    public Caixa(CozinhaMediador mediador) {
        this.mediador = mediador;
        mediador.registrarCaixa(this);
    }

    public void empacotar(String conteudo) {
        System.out.println("Caixa: Embalando - " + conteudo);
        mediador.notificarEntrega(conteudo);
    }
}

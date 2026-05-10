package org.bernardo_duarte.hamburguer.mediator;

/**
 * Colleague - Panela
 */
public class Panela {
    private CozinhaMediador mediador;

    public Panela(CozinhaMediador mediador) {
        this.mediador = mediador;
        mediador.registrarPanela(this);
    }

    public void fritar() {
        System.out.println("Panela: Fritando carne do hambúrguer");
        mediador.notificarPronto("Carne frita e pronta");
    }
}

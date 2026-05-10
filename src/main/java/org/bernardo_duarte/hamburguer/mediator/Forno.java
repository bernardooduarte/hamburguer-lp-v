package org.bernardo_duarte.hamburguer.mediator;

/**
 * Colleague - Forno
 */
public class Forno {
    private CozinhaMediador mediador;

    public Forno(CozinhaMediador mediador) {
        this.mediador = mediador;
        mediador.registrarForno(this);
    }

    public void assar() {
        System.out.println("Forno: Assando pão do hambúrguer");
        mediador.notificarPronto("Pão assado e pronto");
    }
}

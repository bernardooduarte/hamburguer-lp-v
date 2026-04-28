package org.bernardo_duarte.hamburguer.singleton;

public final class PedidoIdGenerator {
    private static volatile PedidoIdGenerator instancia;
    private int sequencia;

    private PedidoIdGenerator() {
        this.sequencia = 0;
    }

    public static PedidoIdGenerator getInstance() {
        if (instancia == null) {
            synchronized (PedidoIdGenerator.class) {
                if (instancia == null) {
                    instancia = new PedidoIdGenerator();
                }
            }
        }
        return instancia;
    }

    public synchronized int proximoId() {
        sequencia++;
        return sequencia;
    }

    public synchronized void reiniciar() {
        sequencia = 0;
    }
}

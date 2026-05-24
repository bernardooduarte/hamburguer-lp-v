package org.bernardo_duarte.hamburguer.interpreter;

public class Numero implements InterpretadorExpressao {
    private final double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    @Override
    public double interpretar() {
        return this.numero;
    }
}

package org.bernardo_duarte.hamburguer.interpreter;

public class Multiplicacao implements InterpretadorExpressao {
    private final InterpretadorExpressao numero1;
    private final InterpretadorExpressao numero2;

    public Multiplicacao(InterpretadorExpressao numero1, InterpretadorExpressao numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public double interpretar() {
        return this.numero1.interpretar() * this.numero2.interpretar();
    }
}

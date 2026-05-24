package org.bernardo_duarte.hamburguer.interpreter;

public class Pedido {
    private double precoHamburguer;
    private double precoBebida;

    public double getPrecoHamburguer() {
        return precoHamburguer;
    }

    public void setPrecoHamburguer(double precoHamburguer) {
        this.precoHamburguer = precoHamburguer;
    }

    public double getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(double precoBebida) {
        this.precoBebida = precoBebida;
    }

    public double calcularTotal() {
        return Lanchonete.calcularTotal(this.precoHamburguer, this.precoBebida);
    }
}

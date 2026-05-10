package org.bernardo_duarte.hamburguer.strategy;

/**
 * Estratégia concreta: Cobertura com Bacon
 */
public class CoberturaBacon implements EstrategiaCobertura {
    private int quantidade;

    public CoberturaBacon(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String aplicarCobertura() {
        return "Cobertura com " + quantidade + " fatias de Bacon crocante";
    }

    @Override
    public double getAdicionavalor() {
        return 4.00;
    }
}

package org.bernardo_duarte.hamburguer.strategy;

/**
 * Estratégia concreta: Cobertura com Queijo
 */
public class CoberturaQueijo implements EstrategiaCobertura {
    private String tipoQueijo;

    public CoberturaQueijo(String tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    @Override
    public String aplicarCobertura() {
        return "Cobertura de Queijo " + tipoQueijo + " derretido";
    }

    @Override
    public double getAdicionavalor() {
        return 3.50;
    }
}

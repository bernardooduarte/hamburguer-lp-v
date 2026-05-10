package org.bernardo_duarte.hamburguer.strategy;

/**
 * Estratégia concreta: Cobertura com Ovo
 */
public class CoberturaOvo implements EstrategiaCobertura {
    private boolean ovoBemPassado;

    public CoberturaOvo(boolean ovoBemPassado) {
        this.ovoBemPassado = ovoBemPassado;
    }

    @Override
    public String aplicarCobertura() {
        return "Cobertura com Ovo " + (ovoBemPassado ? "Bem Passado" : "Mole");
    }

    @Override
    public double getAdicionavalor() {
        return 2.50;
    }
}

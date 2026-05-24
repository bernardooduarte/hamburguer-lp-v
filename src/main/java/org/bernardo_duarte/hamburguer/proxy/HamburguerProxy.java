package org.bernardo_duarte.hamburguer.proxy;

import java.util.List;

public class HamburguerProxy implements IHamburguer {
    private Hamburguer hamburguer;
    private final Integer codigo;

    public HamburguerProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDadosCardapio() {
        if (this.hamburguer == null) {
            this.hamburguer = new Hamburguer(this.codigo);
        }
        return this.hamburguer.obterDadosCardapio();
    }

    @Override
    public List<String> obterIngredientesSecretos(Funcionario funcionario) {
        if (!funcionario.isGerente()) {
            throw new IllegalArgumentException("Funcionario nao autorizado");
        }
        if (this.hamburguer == null) {
            this.hamburguer = new Hamburguer(this.codigo);
        }
        return this.hamburguer.obterIngredientesSecretos(funcionario);
    }
}

package org.bernardo_duarte.hamburguer.strategy;

import org.bernardo_duarte.hamburguer.domain.ItemCardapio;

/**
 * Contexto do Strategy - Hambúrguer que utiliza diferentes estratégias de cobertura
 */
public class HamburguerComEstrategia implements ItemCardapio {
    private String nome;
    private double precoBase;
    private EstrategiaCobertura estrategiaCobertura;

    public HamburguerComEstrategia(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public void setEstrategiaCobertura(EstrategiaCobertura estrategia) {
        this.estrategiaCobertura = estrategia;
    }

    public String prepararComCobertura() {
        if (estrategiaCobertura == null) {
            return nome + " preparado simples";
        }
        return nome + " com " + estrategiaCobertura.aplicarCobertura();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        if (estrategiaCobertura == null) {
            return precoBase;
        }
        return precoBase + estrategiaCobertura.getAdicionavalor();
    }
}
